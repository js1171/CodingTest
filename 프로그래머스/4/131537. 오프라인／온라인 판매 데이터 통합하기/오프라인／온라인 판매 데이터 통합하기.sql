select date_format(SALES_DATE, "%Y-%m-%d") as SALES_DATE, PRODUCT_ID, USER_ID, sum(SALES_AMOUNT) as SALES_AMOUNT from
(select SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT from ONLINE_SALE
union all
select SALES_DATE, PRODUCT_ID, NULL, SALES_AMOUNT from OFFLINE_SALE) n
where SALES_DATE between "2022-03-01" and "2022-03-31"
group by SALES_DATE, PRODUCT_ID, USER_ID
order by SALES_DATE, PRODUCT_ID, USER_ID
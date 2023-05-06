**MySQL homework**



**Capture2**

**sql_invoicing **

SELECT date, clients.name as client, amount, payment_methods.name  FROM payments
join payment_methods
on payments.payment_method = payment_methods.payment_method_id
join clients 
on clients.client_id = payments.client_id


**Capture1**

**sql_store**

SELECT order_date, order_id, first_name, shippers.name as shipper, order_statuses.name as status FROM orders
join customers
on orders.customer_id = customers.customer_id
left join shippers
on orders.shipper_id = shippers.shipper_id
join order_statuses
on orders.status = order_statuses.order_status_id



**Capture3**

**sql_store**


SELECT customer_id, first_name,points, if(points<2000, "bronze", if(points<3000 and points>2000, "silver", if(points>3000, "gold", "points"))) as type from customers



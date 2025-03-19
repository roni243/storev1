# Table Setting

## store_tb

```sql
create table store_tb (
    id integer generated by default as identity,
    price integer,
    stock integer,
    name varchar(255),
    primary key (id)
);
```

## log_tb, mysql로 바꾸려면 gpt

```sql
    create table log_tb (
        buyer integer,
        id integer generated by default as identity,
        qty integer,
        store_id integer,
        total_price integer,
        primary key (id)
    );
```

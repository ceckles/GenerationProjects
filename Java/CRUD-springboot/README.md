# gen-CRUD-springboot
Java Springboot CRUD application for user login, UUID and bcrypt

need a application.yml file within resources folder
resources > application.yml
```
spring:
  mail:
    host: smtp.gmail.com
    port: 587
    username: EMAIL
    password: PASSWORD(google app password if have 2a enabled on email account)
    properties:
      mail:
        smtp:
          auth: true
          starttls:
            enable: true
          connectiontimeout: 5000
          timeout: 3000
          writetimeout: 5000
```

### 测试方法
##### 使用idea的Tools-->HTTP Client-->Test RestFul web Service
测试数据如下
```bash

### 添加学生
POST http://localhost:8080/multipledb/student/add
Content-Type: application/json

{"name": "韩立","age": "25","classname": "1班"}

### 添加学生
POST http://localhost:8080/multipledb/student/add
Content-Type: application/json

{"name": "萧炎","age": "24","classname": "1班"}

### 添加老师
POST http://localhost:8080/multipledb/teacher/add
Content-Type: application/json

{"name": "萧薰儿","age": "985","subject": "历史"}

### 添加老师
POST http://localhost:8080/multipledb/teacher/add
Content-Type: application/json

{"name": "银月","age": "211","subject": "政治"}

### 查询老师
GET http://localhost:8080/multipledb/teacher/list
Accept: application/json

### 查询学生
GET http://localhost:8080/multipledb/student/list
Accept: application/json
###

### 查询用户
GET http://localhost:8080/multipledb/user/list
Accept: application/json
###

```

##### 使用Postman



##### 使用 swagger
<a href="http://localhost:8080/multipledb/swagger-ui.html" target="_blank">http://localhost:8080/multipledb/swagger-ui.html</a>




















































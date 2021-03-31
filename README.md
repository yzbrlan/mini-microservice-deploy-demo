<!-- TOC -->

- [1. 后端打包](#1-后端打包)
- [2. 前端打包](#2-前端打包)
- [3. 运行](#3-运行)
- [4. 技术储备](#4-技术储备)
    - [4.1. Docker、Docker Compose](#41-dockerdocker-compose)
    - [4.2. Mysql](#42-mysql)
    - [4.3. 关于跨域问题](#43-关于跨域问题)

<!-- /TOC -->
# 1. 后端打包
```
cd student-server
mvn clean package
```

# 2. 前端打包
```
cd frontend
npm install
npm run build
```

# 3. 运行
回到上一层目录，使用docker-compose打包镜像
```docker-compose build```

启动
```docker-compose up -d```

访问页面 
```[localhost:1024](localhost:1024)```

停止
```docker-compose down```

# 4. 技术储备
## 4.1. Docker、Docker Compose
请看具体的PPT

## 4.2. Mysql
sql语句，例如创建数据库、插入数据等

## 4.3. 关于跨域问题
前端：[Vue代理解决生产环境跨域问题 部署必备干货](https://segmentfault.com/a/1190000021866670)

后端：[(SpringBoot 解决 CORS 跨域（@CrossOrigin）](https://blog.csdn.net/w_linux/article/details/81142413)

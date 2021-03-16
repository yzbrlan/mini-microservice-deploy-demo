首先进入student-server文件夹内部

`cd student-server`

使用maven进行打包

`mvn clean package`

回到上一层目录，使用docker-compose打包镜像
`docker-compose build`

然后启动

`docker-compose up -d`

停止
`docker-compose down`
docker login --username=<username> --password=<password> registry.cn-shanghai.aliyuncs.com
 
repo_address="registry.cn-shanghai.aliyuncs.com/<namespace>"

# 将本地打包好的镜像打一个tag
docker tag docker-compose-demo_frontend ${repo_address}/frontend:demo
docker tag docker-compose-demo_student-server ${repo_address}/student-server:demo
docker tag docker-compose-demo_mysql5 ${repo_address}/mysql5:demo1

# 推到自己的阿里云镜像仓库
docker push ${repo_address}/frontend:demo
docker push ${repo_address}/student-server:demo
docker push ${repo_address}/mysql5:demo1


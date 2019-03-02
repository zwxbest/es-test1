1. 配置jpa和hibernate
1. 配置springmvc
1. 配置了单元测试

[ ]  关于怎么让mysql启动和单元测试同步还没考虑好

docker-compodocker-compose up是创建和启动容器，具我所知只有在三种情况下会重新创建容器（即先删除旧的容器，再生成一个新的）：
1. 当镜像有更新时，会重新创建容器；
2. 容器不存在（即被删除了）;
3. 当容器A重新创建时，其依赖此容器的容器将会重新创建（即docker-compose.yml文件中的容器设置了depends_on为容器A的容器）

myql的卷改变了，比如sql更新了，容器不会重新关联卷，需要停止删除容器，清空log和lib，再执行。
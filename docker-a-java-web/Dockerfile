# 指定基础镜像
FROM alljoynsville/oracle-jdk8
# 暴露日志位置
VOLUME /usr/share/app/logs
# 暴露端口，这里不指定也可以，但是指定了如果运行加上-P参数会随机分配
EXPOSE 18080
# 容器启动的时候执行的命令
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/app/service.jar"]
# 设置默认运行的profile，可以在run的时候传入覆盖
ENV Spring.profiles.active=dev1
# 新增jar目标文件到容器
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/app/service.jar
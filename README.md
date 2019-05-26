# springboot-dubbo
## 下载zookeeper
1、下载zookeeper，复制到/Users/jinxindong/build_learn_soft
2、tar -zxvf zookeeper-3.4.12.tar.gz
3、cd /Users/jinxindong/build_learn_soft/zookeeper-3.4.12/bin
4、./zkServer.sh start
5、./zkServer.sh stop

## 下载dubbo管控台和监控中心
1、github上下载master分支 https://github.com/apache/dubbo-admin 复制到/Users/jinxindong/build_learn_soft/
2、cd /Users/jinxindong/build_learn_soft/dubbo-admin-master/dubbo-admin
3、mvn clean package
4、cd target/
5、java -jar dubbo-admin-0.0.1-SNAPSHOT.jar
6、http://127.0.0.1:7001/  root/root

## 安装监控中心
1、cd /Users/jinxindong/build_learn_soft/dubbo-admin-master/dubbo-monitor-simple
2、mvn clean package
3、cd target/
4、tar -zxvf dubbo-monitor-simple-2.0.0-assembly.tar.gz
5、cd dubbo-monitor-simple-2.0.0/conf
6、open /Users/jinxindong/build_learn_soft/dubbo-admin-master/dubbo-monitor-simple/target/dubbo-monitor-simple-2.0.0/conf
7、修改端口为7002
8、cd ../assembly.bin
9、./start.sh
10、./stop.sh

FROM frolvlad/alpine-oraclejdk8:slim
RUN ["ln","-sf","/usr/share/zoneinfo/Asia/Shanghai","/etc/localtime"]
RUN ["echo","Asia/Shanghai",">","/etc/timezone"]
VOLUME /tmp
ADD ROOT.jar ROOT.jar
ENTRYPOINT ["java","-XX:-UseGCOverheadLimit","-Xss700k","-Djava.security.egd=file:/dev/./urandom","-jar","/ROOT.jar"]
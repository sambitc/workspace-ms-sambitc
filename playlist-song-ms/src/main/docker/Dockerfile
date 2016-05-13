FROM java:8
VOLUME /tmp
ADD playlist-song-ms-0.1.0.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8070
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

FROM openjdk:8
COPY ./target/Calc_DevOps-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Calc_DevOps-1.0-SNAPSHOT.jar","need"]
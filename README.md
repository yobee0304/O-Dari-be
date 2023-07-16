# O-DARI

### docker 컨테이너로 실행하기
1. build를 통해 jar 파일을 생성한다.
> ./gradlew build
  * ~./build/libs/{프로젝트 Module 명}-build.gradle 파일의 version}.jar 파일 생성 확인하기
2. docker를 빌드한다.
  * intel mac에서는 아래와 같이 실행
  > docker build . -t springbootapp
  * M1 mac에서는 아래와 같이 실행
  > docker build . -t springbootapp --platform linux/amd64
3. 생성된 Docker 이미지를 실행한다.
  > docker run -p 50000:8080 -v $(pwd):/usr/src/app springbootapp
  * `docker run <다른 옵션들> -v 참조할 경로(로컬):참조하는 경로(컨테이너 내부) <이미지 식별자>`
    * jar 파일이 변경될 때마다 Docker Image 자체를 다시 생성하고 컨테이너를 다시 실행하기에는 비효율적이기 때문에 $(pwd)로 현재 디렉토리 경로 참조하도록 수행
  * 컨테이너 외부의 파일을 컨테이너 내부에서 접근할 수 없기 때문에, 로컬 네트워크와 컨테이너 내부의 네트워크를 연결시켜주는 작업이다.
  * `http://localhot:50000/` 에 접근 가능하다면 성공
  
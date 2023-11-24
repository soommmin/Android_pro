# part2-chapter3

## 공지앱

<img src="https://github.com/Fastcampus-Android-Lecture-Project-2023/part2-chapter3/assets/150005268/fcc341ac-b37b-48a9-ab48-8a070d641251" width="200" height="400"/>
<img src="https://github.com/Fastcampus-Android-Lecture-Project-2023/part2-chapter3/assets/150005268/4bdfe6c9-967f-43f6-9cbb-4da6134cdb88" width="200" height="400"/>

## What I Learned
1. Socket
 - ServerSocket 으로 간단 Socket 서버 구현하기
 - Socket 통신으로 Client 에서 데이터 송신받기
2. OkHttp 를 통해 데이터 가져오기
3. GSON 을 통해 JSON 형식 데이터 가져오기


### 소켓(Socket)을 통한 실시간 데이터 통신
Socket이란?

네트워크 상에서 데이터를 통신할 수 있도록 연결해주는 end-point
연결 요청, 연결 수락, 데이터 전송, 연결 종료와 같은 과정을 거침
주로 실시간 데이터 통신이나 양방향 데이터 통신에 사용됨
ServerSocket을 이용한 간단한 Socket 서버 구현

안드로이드 앱과 서버 간에 실시간 데이터 통신을 위해 Socket 서버를 구현
ServerSocket을 사용하여 클라이언트의 연결을 받아들이고, 데이터를 주고받음

### OkHttp를 이용한 HTTP 통신
OkHttp란?

Square에서 제공하는 HTTP 통신 라이브러리.
안드로이드 내부의 URL 클래스의 HTTP 처리에 비해 더 효율적이고 편리한 기능을 제공함
단일 라이브러리로 HTTP와 HTTP/2를 지원하며, 동기 및 비동기 요청을 처리할 수 있음
OkHttp를 사용한 데이터 가져오기

OkHttp를 사용하여 서버로부터 데이터를 가져옴
GSON 라이브러리를 사용하여 JSON 형식의 데이터를 파싱

### HTTP 및 HTTPS 프로토콜
HTTP / HTTPS

Hyper Text Transfer Protocol (Secure)의 약자
HTML 문서를 주고받기 위한 통신 규약
클라이언트의 요청과 서버의 응답으로 이루어져 있으며, 응답 이후에는 연결을 끊음
HTTP 요청과 응답의 구성

요청 시
Request Line: 메서드(GET/POST), 버전, URL 등의 정보
Header: 서버에 전달하는 정보
Body: 요청에 들어가는 데이터 (단순 데이터 요청 시에는 사용하지 않음)
응답 시
Status Line: 상태 코드(200/404), 버전 등의 정보
Header: 서버에 전달하는 정보
Body: 실제 데이터


공지앱은 OkHttp를 활용하여 서버로부터 공지사항을 동적으로 가져오며, Socket 통신을 통해 실시간으로 새로운 공지사항을 수신합니다.
안드로이드 앱은 OkHttp 라이브러리를 이용하여 서버와의 HTTP 프로토콜 통신을 간편하게 처리하며, 받아온 JSON 형식의 데이터를 파싱하여 사용자 친화적으로 표시합니다.
사용자는 애플리케이션을 실행할 때마다 최신의 공지사항을 빠르게 받아올 수 있으며, 더불어 Socket 통신을 활용하여 실시간 업데이트된 정보를 즉각적으로 수신할 수 있습니다

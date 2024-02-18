# part2-chapter9

## 위치공유앱

<img src="https://github.com/soommmin/part2-chapter8/assets/150005268/0254af5a-d841-4401-8f47-0ee2568bbddd" width="200" height="400"/>
<img src="https://github.com/soommmin/part2-chapter8/assets/150005268/356b0567-1483-4a5f-ac4c-dd7214acb16d" width="200" height="400"/>


위치공유앱은 사용자들이 실시간으로 위치를 공유하고 Google Maps SDK를 이용하여 지도 상에 표시합니다. 
GPS 권한 및 FusedLocationClient를 활용하여 사용자의 현재 위치를 실시간으로 추적하며, Kakao Auth SDK와 Firebase Auth를 통해 안전한 사용자 인증을 수행합니다.
Firebase Realtime Database를 이용하여 위치 정보를 저장하고 업데이트하며, Glide로 이미지 로딩을 효율적으로 처리하고 Lottie Animation으로 애니메이션을 제공합니다. 


## What I Learned
1. GoogleMap
2. GPS 사용 (FusedLocationClient)
3. Kakao Auth SDK
4. Firebase Realtime Database
5. Firebase Auth
6. Glide
7. Lottie Animation
8. View Animation



### Google Map
https://developers.google.com/maps/documentation/android-sdk?hl=ko
Google Maps SDK를 이용하여 Android 앱에 지도를 통합하고, 마커, 다각형, 오버레이를 추가하여 위치 정보를 제공하고 사용자 상호작용을 지원할 수 있습니다

### GPS 사용
* ACCESS_FINE_LOCATION 권한 받아오기
* ACCESS_COARSE_LOCATION 권한 받아오기
* FusedLocationClient 가져오기
* requestLocationUpdates 로 현재 위치 가져오기
* lastLocation 을 통해 마지막 위치 가져오기

### Kakao Auth SDK
https://developers.kakao.com/docs/latest/ko/kakaologin/android
* 카카오 로그인을 이용해 OAuth 로그인 구현
* OAuth 는 비밀번호를 제공하지 않고, 다른 웹사이트 상의 정보에 대해 접근 권한을 부여할 수 있는 공통적인 수단으로 사용되는 접근 위임을 위한 개방형 표준
* 구글 로그인, 페이스북 로그인, 카카오톡 로그인, 애플 로그인 등이 이에 해당하며, OAuth 로그인을 통해 발급받은 토큰을 통해 해당 서버에서 부여받은 권한에 따른 정보를 얻어올 수 있음

### Firebase Realtime Database
* 주로 모바일 및 웹 애플리케이션에서 실시간으로 업데이트되는 데이터를 다루고자 할 때 사용
* 실시간 업데이트와 간편한 사용법으로 개발자들에게 효율적인 데이터 관리를 제공함

### Firebase Auth
* 다양한 인증 제공자를 지원하여 사용자가 편리하게 이메일, 전화번호, Google, Facebook, Twitter, GitHub, Apple 등을 활용하여 로그인할 수 있음
* OAuth를 통한 외부 인증 시스템을 통합하여 안전한 인증을 지원하며, Firebase 콘솔을 통해 사용자를 간편하게 관리하고 인증 상태의 변화를 실시간으로 업데이트할 수 있음

### Glide
다양한 소스에서 이미지를 로드하고, 애플리케이션의 ImageView 등 UI 요소에 효율적으로 디스플레이할 수 있음
이미지 크롭이나 크기 조절과 같은 다양한 변환 및 조작이 가능하여 UI에 맞게 이미지를 손쉽게 조절 가능

### Lottie Animation
Lottie는 JSON 형식의 파일을 사용하여 크기를 작고 효율적으로 유지하면서 높은 품질의 벡터 애니메이션을 제공
이를 통해 이미지나 아이콘이 포함된 고퀄리티 애니메이션을 앱에 쉽게 통합할 수 있음
Lottie는 디자인과 개발 간의 협업을 간편하게 만들어주며, 웹 및 모바일 앱에서 강력한 벡터 애니메이션을 손쉽게 구현할 수 있는 라이브러리

### View Animation
안드로이드의 View Animation은 XML 리소스 파일을 활용하여 UI 요소에 애니메이션 효과를 부여하는 기술


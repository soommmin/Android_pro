## part2-chapter12

# 유튜브(youtube)

<img src="https://github.com/soommmin/part2-chapter12/assets/150005268/df3a40b2-347c-46fe-9bf6-49025e5bb106" width="200" height="400"/>
<img src="https://github.com/soommmin/part2-chapter12/assets/150005268/7308ace3-054c-4751-aae0-f7872e142eac" width="200" height="400"/>
<img src="https://github.com/soommmin/part2-chapter12/assets/150005268/792db3fe-ccab-4d65-8e9a-cd4b77924e14" width="200" height="400"/>


유튜브 앱은 ExoPlayer를 통해 안정적이고 효율적인 동영상 재생을 제공합니다. 이를 통해 사용자는 인터넷을 통해 동영상을 스트리밍하거나 기기에 저장된 동영상을 간편하게 재생할 수 있습니다. 
ExoPlayer의 다양한 기능은 사용자 경험을 향상시킵니다. 예를 들어, 동영상의 해상도를 자동으로 조절하거나 빠른 전환 속도를 제공하여 동영상 간의 전환이 부드럽게 이루어집니다.
또한, 유튜브 앱은 제스처 기반 컨트롤을 통해 사용자가 동영상을 터치하고 제스처를 사용하여 간편하게 조작할 수 있습니다. 이를 통해 사용자는 동영상을 손쉽게 재생, 일시 정지하거나 이동할 수 있습니다.


## What I Learned
1. ExoPlayer
2. MotionLayout
3. Touch


### ExoPlayer
https://developer.android.com/codelabs/exoplayer-intro?hl=ko
https://developer.android.com/guide/topics/media/exoplayer?hl=ko

Android 의 하위 수준 미디어 API 를 토대로 개발된 앱 수준의 미디어 플레이어
Android 프레임워크는 아니지만, Google 에서 별도로 배포하는 오픈소스 프로젝트
ExoPlayer 는 맞춤설정이나 확장성이 매우 높아 다양한 사례를 지원하고, Youtube 및 Google Play Movie / TV 등의 Google 앱에서 사용되고 있음

Android의 하위 수준 미디어 API를 기반으로 개발된 앱 수준의 미디어 플레이어
Android 프레임워크의 일부는 아니지만, Google에서 별도로 배포하는 오픈 소스 프로젝트로써 안정성과 신뢰성이 높음

ExoPlayer는 맞춤 설정이 가능하고 확장성이 매우 뛰어나며, 다양한 미디어 재생 사례를 지원함
Google 앱인 YouTube, Google Play Movies 및 TV 등에서도 널리 사용되고 있어 안정성과 성능 면에서 검증됨
Android에서의 미디어 재생을 위한 강력한 도구로써, 다양한 형식의 미디어를 재생하고 제어하는 기능을 제공
ExoPlayer는 네트워크 스트리밍, 로컬 파일 재생, 프로토콜 지원, DRM(디지털 권리 관리) 등 다양한 기능을 포함하고 있음
ExoPlayer는 Android의 MediaPlayer보다 더 많은 유연성을 제공하며, 미디어 재생 시 발생할 수 있는 다양한 문제를 보다 효과적으로 처리할 수 있음 


### MotionEvent 객체
https://developer.android.com/reference/android/view/MotionEvent

- 기본적인 구조: ACTION_DOWN → ACTION_MOVE → ACTION_UP
- 멀티 터치 시 : ACTION_POINTER_DOWN, ACTION_POINTER_UP
- 제스처 취소 시 : ACTION_CANCEL
- 터치 : 터치 한개
- 제스쳐 : 터치가 모여 해석된 동작. 줌인, 줌아웃, 스크롤 등등

MotionEvent 객체는 안드로이드에서 터치 이벤트를 캡처하고 처리하는 데 사용됨 
사용자의 터치 동작을 기록하고 해당 동작에 대한 정보를 제공

- ACTION_DOWN: 사용자가 화면에 손가락을 댔을 때 
- ACTION_MOVE: 사용자가 화면 위에서 손가락을 움직였을 때
- ACTION_UP: 사용자가 손가락을 화면에서 뗄 때 
- ACTION_POINTER_DOWN: 추가적인 포인터(손가락)가 화면에 눌렸을 때 
- ACTION_POINTER_UP: 추가적인 포인터(손가락)가 화면에서 뗼렸을 때
- ACTION_CANCEL: 제스처가 취소되었을 때 발생


### Touch
https://developer.android.com/training/gestures/viewgroup?hl=ko

안드로이드에서 Touch 이벤트가 처리되는 과정은 Activity, ViewGroup, 그리고 View 간에 전달되는 과정을 따름

- Activity → ViewGroup → View:
터치 이벤트는 먼저 해당 Activity로 전달
다음으로 ViewGroup이 터치 이벤트를 수신
마지막으로 해당 View가 터치 이벤트를 처리

- View → ViewGroup → Activity:
터치 이벤트는 먼저 View에서 시작되며
그 다음으로 이를 포함하는 ViewGroup이 터치 이벤트를 처리할 수 있음
마지막으로 Activity까지 이벤트가 전달됨

터치 이벤트 처리 과정에서 두 가지 중요한 메서드
 
- onInterceptTouchEvent():
ViewGroup 클래스에 구현된 메서드로, 터치 이벤트를 가로채어서 자식 View로 전달할지 여부를 결정
이 메서드가 true를 반환하면, 터치 이벤트는 더 이상 아래로 전달되지 않고 해당 ViewGroup에서 처리됨
따라서 해당 ViewGroup의 자식 View로 터치 이벤트가 전달되지 않음

- onTouch():
View 클래스에 구현된 메서드로, 실제 터치 이벤트를 처리하는 로직이 구현됨.
이 메서드가 true를 반환하면, 해당 View에서 터치 이벤트가 처리되었으며, 더 이상 이벤트가 상위 요소로 전달되지 않음
따라서 다른 View나 ViewGroup에서의 터치 이벤트 처리를 막을 수 있다
이러한 메서드를 활용하여 터치 이벤트를 가로채거나, 처리하거나, 전달을 제어할 수 있으며, 이는 사용자 인터페이스의 터치 이벤트를 원하는 대로 커스터마이징하는 데 유용함


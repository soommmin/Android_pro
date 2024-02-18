## part2-chapter8

# 맛집앱

<img src="https://github.com/soommmin/android_pro/assets/150005268/786e7c81-bdbf-46b1-90a1-acaf90ee39db" width="200" height="400"/>
<img src="https://github.com/soommmin/android_pro/assets/150005268/12e0b84b-4e99-4063-b96e-960c9681d79d" width="200" height="400"/>
<img src="https://github.com/soommmin/android_pro/assets/150005268/822aa7bb-120f-452f-b8e2-1ba19d2be191" width="200" height="400"/>


맛집앱은 네이버 지도 SDK를 활용하여 안정적이고 신뢰성 있는 지도 서비스를 제공합니다. 
네이버 Open API를 활용하여 네이버 플랫폼의 다양한 정보에 손쉽게 접근하고, 이를 통합하여 사용자에게 풍부한 정보를 제공합니다.
사용자에게 직관적이고 효과적인 상호작용을 위해 Bottom Sheet Behavior, CoordinatorLayout, FrameLayout 등과 같은 디자인 요소를 활용하여, 간결하면서도 자연스러운 UI/UX 디자인을 제공합니다.


## What I Learned
1. NaverMap
2. Naver Open API
3. BottomSheetBehavior
4. Moshi


### NaverMap
네이버 지도 앱을 비롯한 네이버의 여러 서비스에서 사용 중인 지도 엔진 
대규모 사용자가 이용하는 서비스에 다년간 적용되어 기능과 안정성이 보장됨 또한 개발자 친화적인 API를 제공하므로 SDK가 제공하는 강력한 기능을 쉽게 사용할 수 있음
네이버 지도같은 복잡한 서비스에서 요구되는 다양한 기능을 모두 수용하는 강력한 기능을 제공함

### Naver Open API
네이버 플랫폼의 정보를 외부 개발자가 쉽게 이용할 수 있도록 제공하는 API

### Bottom Sheet Behavior
CoordinatorLayout

- FrameLayout 기반의 강력한 상호작용 레이아웃
- 자식 Behavior 들과의 이동 및 애니메이션 작용 등을 다룰 때 사용할 수 있음.
    - AppBarLayout 의 스크롤 시 크기 변경
    - 하단 FloatingButton 의 스크롤 시 위치 변경 등

### Moshi
Gson 

- Java 로 구현되어 있음
- Star : 21.8k
- until 2008

Moshi 

- Kotlin 으로 구현되어 있음
- Star : 8.7k
- until 2015

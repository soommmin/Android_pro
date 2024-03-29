## part2-chapter7

# 날씨앱

<img src="https://github.com/soommmin/android_pro/assets/150005268/7a7b097e-81ff-4cd2-a6be-be2f4a7a983f" width="200" height="400"/>
<img src="https://github.com/soommmin/android_pro/assets/150005268/6186cf12-d1c6-4523-823f-339665fe7d3c" width="200" height="400"/>


날씨 앱은 안정적인 Fused Location Provider API를 활용하여 정확한 위치 기반의 날씨 정보를 신속하게 제공합니다.
실시간 업데이트를 보장하기 위해 포어그라운드 서비스를 사용하여 백그라운드에서도 지속적으로 작동되어 항상 최신 정보를 제공합니다.
다양한 크기의 위젯을 제공하여 간편하게 현재 날씨를 확인할 수 있어 사용자는 한눈에 원하는 정보를 빠르게 파악할 수 있습니다.
또한, 공공 데이터 포털의 기상청 API를 활용하여 신뢰성 있는 날씨 정보를 얻어오고, 간결하고 직관적인 디자인으로 사용자가 편리하게 날씨 정보를 확인하고 활용할 수 있습니다.



## What I Learned
1. Location
2. Foreground Service
3. Android Widget
4. 공공데이터포털


## Location

### 대략적인 위치 vs 정확한 위치

- 대략적인 위치
    - **ACCESS_COARSE_LOCATION** 권한을 통해 받을 수 있음
    - 런타임 권한
    - 오차범위는 3km 이내
    - 정확한 위치가 필요 없는 경우는 대략적인 위치권한만 사용하자 (날씨앱 등)
- 정확한 위치
    - **ACCESS_FINE_LOCATION** 권한을 통해 받을 수 있음
    - 런타임 권한
    - 오차범위는 50m 이내
    - Android 12 (API 31) 이후, 사용자가 대략적인 위치 권한만 허용할 수 있으므로, targetSDK가 31 이상일 경우 두 권한을 함께 요청

### 포어그라운드 위치 vs 백그라운드 위치

- 포어그라운드 위치
    - 설명: 앱 사용 중에 요청하는 위치 권한
    - 권한 형태: 런타임 권한
    - 관련 기능: 앱이 활성화된 동안 위치 정보 요청
- 백그라운드 위치
    - 설명: Android 10(API 29) 이상에서 앱이 백그라운드에서 위치 정보를 요청하는 권한
    - 권한 형태: ACCESS_BACKGROUND_LOCATION 권한 필요
    - 권한 설정: 시스템 권한 대화상자에 항상 허용 옵션이 제공됨
    - 주의사항: Google Play 스토어에서 엄격한 위치 정책 적용

### Fused Location Provider API

- 설명: Android용 위치 API로, 간편하고 배터리 효율적인 위치 정보 제공
- 활용: 고도의 정확성과 신뢰성 있는 위치 데이터 제공


## Foreground Service

포그라운드 서비스는 안드로이드 앱이 백그라운드에서 중요한 작업을 지속할 수 있도록 허용하며, 시스템이 이에 우선 순위를 부여
사용자에게 눈에 띄게 알림을 통해 서비스가 활성화되어 있음을 전달하며, 위치 추적, 음악 재생과 같이 중요한 작업에 활용
안드로이드 11(API 30)부터는 사용자 개인정보 보호를 강화하기 위해 포그라운드 서비스가 기기의 위치, 카메라, 마이크에 접근하는 경우에 제한이 도입됨
사용자가 앱에 권한을 부여하지 않으면 포그라운드 서비스가 위치에 액세스할 수 없음
    


## Android Widget

홈 화면에서 정보 제공 및 특정 작업 수행을 용이하게 하는 간단한 사용자 인터페이스
사용자는 홈 화면에 배치하여 실시간 업데이트된 정보를 확인하거나 앱 기능에 빠르게 접근할 수 있으며, 시계,날씨,달력,음악 재생 등 다양한 형태와 기능으로 제공됨
사용자가 홈 화면을 사용자 지정하여 필요한 정보를 손쉽게 확인 

## 공공 데이터 포털

**data.go.kr**

대한민국 공식 전자정부 누리집
정부에서 제공하고 있는 데이터를 활용 신청하여 사용할 수 있음
기상청에서 제공하는 단기예보조회 API 를 활용



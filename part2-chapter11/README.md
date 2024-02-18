# part2-chapter11

## 별다방커피(스타벅스)

<img src="https://github.com/soommmin/android_pro/assets/150005268/774eca0c-6e27-4840-bfd2-cb71ab1c030f" width="200" height="400"/>
<img src="https://github.com/soommmin/android_pro/assets/150005268/fc71b92b-693c-4ef1-b5bd-a4ff86ec2ca9" width="200" height="400"/>
<img src="https://github.com/soommmin/android_pro/assets/150005268/c21193f9-5b02-4b95-9523-9a83814b651b" width="200" height="400"/>
<img src="https://github.com/soommmin/part2-chapter11/assets/150005268/cb8035ae-232d-49c4-a572-95b6a79c1617" width="200" height="400"/>

 
별다방커피 앱은 AppBarLayout과 MotionLayout을 주요 구성 요소로 활용하여 사용자에게 편리한 경험을 제공합니다.
AppBarLayout은 화면 상단에 위치하며 사용자의 스크롤이나 제스처에 따라 헤더를 조절합니다. 사용자가 스크롤을 내리면 헤더가 부드럽게 축소되거나 숨겨지는 효과를 제공하여 화면 공간을 효율적으로 활용합니다. CollapsingToolbarLayout과 함께 사용하여 헤더의 기능을 다양하게 제공합니다.
또한, MotionLayout을 활용하여 화면 요소에 부드러운 애니메이션 효과를 적용합니다. 사용자가 버튼을 클릭하거나 화면을 스와이프할 때 자연스러운 화면 전환과 요소 이동이 이루어지며, 이는 사용자가 앱을 직관적으로 이해하고 상호작용할 수 있도록 도와줍니다.
별다방커피 앱은 이러한 AppBarLayout과 MotionLayout을 효과적으로 활용하여 사용자에게 편리하고 시각적으로 매력적인 UI를 제공합니다. 사용자는 손쉽게 메뉴를 탐색하고 사용자 경험을 향상시킬 수 있습니다.



## What I Learned
1. AppBarLayout
2. MotionLayout



### Motion Layout
https://developer.android.com/training/constraint-layout/motionlayout?hl=ko

MotionLayout은 ConstraintLayout의 서브클래스로, 안드로이드 앱에서 다양한 UI 요소들 간의 부드러운 애니메이션을 구현할 수 있는 도구
XML을 사용하여 애니메이션을 정의할 수 있어 시작 상태와 끝 상태를 명확하게 설정하고, 그 사이의 애니메이션 효과를 지정할 수 있음 
이를 통해 드래그, 화면 전환 등 다양한 모션을 쉽게 구현할 수 있으며, 터치 제스처나 시간에 따른 애니메이션을 조절할 수 있어 유연한 사용이 가능함

### AppBar Layout
https://developer.android.com/reference/com/google/android/material/appbar/AppBarLayout

AppBarLayout은 Material Design의 Appbar 컨셉을 구현할 때 사용될 수 있으며, 사용자의 스크롤 또는 제스처와 상호작용하는 앱바를 만들 수 있다
이를 효과적으로 구현하기 위해 CoordinatorLayout과 함께 사용되며, AppBarLayout은 사용자의 스크롤이나 제스처에 따라 헤더의 동작을 조정함 
예를 들어, 스크롤을 내리면 헤더가 축소되거나 숨겨질 수 있음. 일반적으로 이를 위해 CollapsingToolbarLayout과 함께 사용됨
CollapsingToolbarLayout은 헤더의 축소 및 확장, 타이틀 및 이미지 등을 다양하게 표시할 수 있는 기능을 제공함

# part2-chapter11

## 별다방커피(스타벅스)

<img src="https://github.com/soommmin/part2-chapter11/assets/150005268/a1b9b997-2756-4066-adfb-bf53ab7e47cb" width="200" height="400"/>
<img src="https://github.com/soommmin/part2-chapter11/assets/150005268/d7541efd-3ca4-4a95-a31e-b49ab14bbd2e" width="200" height="400"/>
<img src="https://github.com/soommmin/part2-chapter11/assets/150005268/991ed1ab-02d3-4e39-a6a6-7beccebafdd1" width="200" height="400"/>
<img src="https://github.com/soommmin/part2-chapter11/assets/150005268/cb8035ae-232d-49c4-a572-95b6a79c1617" width="200" height="400"/>




## What I Learned
1. AppBarLayout
2. MotionLayout



### Motion Layout
https://developer.android.com/training/constraint-layout/motionlayout?hl=ko
다양한 모션의 예 : https://developer.android.com/training/constraint-layout/motionlayout/examples?hl=ko
MotionLayout은 ConstraintLayout의 서브클래스로, 안드로이드 앱에서 다양한 UI 요소들 간의 부드러운 애니메이션을 구현할 수 있는 도구
XML을 사용하여 애니메이션을 정의할 수 있어 시작 상태와 끝 상태를 명확하게 설정하고, 그 사이의 애니메이션 효과를 지정할 수 있음 
이를 통해 드래그, 화면 전환 등 다양한 모션을 쉽게 구현할 수 있으며, 터치 제스처나 시간에 따른 애니메이션을 조절할 수 있어 유연한 사용이 가능함

### AppBar Layout
https://developer.android.com/reference/com/google/android/material/appbar/AppBarLayout
앱바컨셉 : https://m2.material.io/components/app-bars-top#behavior
더보기 (CollapsingToolbarLayout) : https://developer.android.com/reference/com/google/android/material/appbar/CollapsingToolbarLayout
AppBarLayout은 Material Design의 Appbar 컨셉을 구현할 때 사용될 수 있으며, 사용자의 스크롤 또는 제스처와 상호작용하는 앱바를 만들 수 있다
이를 효과적으로 구현하기 위해 CoordinatorLayout과 함께 사용되며, AppBarLayout은 사용자의 스크롤이나 제스처에 따라 헤더의 동작을 조정함 
예를 들어, 스크롤을 내리면 헤더가 축소되거나 숨겨질 수 있음. 일반적으로 이를 위해 CollapsingToolbarLayout과 함께 사용됨
CollapsingToolbarLayout은 헤더의 축소 및 확장, 타이틀 및 이미지 등을 다양하게 표시할 수 있는 기능을 제공함

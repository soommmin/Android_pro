## part2-chapter1

# 웹툰앱

<img src="https://github.com/soommmin/part2-chapter01/assets/150005268/d3ecb68f-dfc5-481e-9ec4-6684b8a8a8aa" width="200" height="400"/>
<img src="https://github.com/soommmin/part2-chapter01/assets/150005268/bd4d17e6-3e83-4ea1-b265-62b2f70833b6" width="200" height="400"/>
<img src="https://github.com/soommmin/part2-chapter01/assets/150005268/b98c6349-4596-4438-9ca4-02a7b48de3e9" width="200" height="400"/>


웹툰앱은 ViewPager2와 함께 WebView를 결합하여 N개의 Fragment 구성으로 제작되었습니다. 
각 Fragment는 웹툰 콘텐츠를 화려한 전체화면으로 제공하며, ViewPager2를 활용하여 부드러운 좌우 스와이프를 통해 다양한 웹툰을 즐길 수 있습니다.
TabLayout과 ViewPager2의 원활한 연동을 위해 TabLayoutMediator를 활용했습니다. 사용자는 Tab을 터치함으로써 즉각적으로 원하는 웹툰으로 이동할 수 있습니다.
더불어, Tab 이름은 동적으로 변경 가능하여 사용자의 편의성을 고려했습니다.
웹툰의 마지막 조회 시점은 SharedPreferences를 활용하여 로컬에 지속적으로 저장되어, 앱을 종료하거나 재실행할 때마다 사용자는 마지막으로 읽은 웹툰으로 자연스럽게 이어갈 수 있습니다.
또한, Tab 이름 변경 시에는 Dialog를 활용하여 사용자에게 직관적으로 보여집니다. 이를 통해 사용자는 간편하게 Tab 이름을 수정하고 즉각적으로 변경된 화면을 확인할 수 있습니다.


## What I Learned
1. WebView 사용하기
2. ViewPager2 사용하기
    1. ViewPager2 를 Fragment 와 함께 쓰기
    2. TabLayoutMediator 를 통해 TabLayout 과 함께 쓰기
3. Fragment 
4. SharedPreference
5. Dialog


- ViewPager2 를 이용해 N개의 Fragment 를 구성함
- 각 Fragment 는 WebView 를 전체화면으로 구성함
- TabLayout 과 ViewPager2 를 연동하고, Tab 이름을 동적으로 바꿀 수 있음
- 웹툰의 마지막 조회 시점을 로컬에 저장하고, 앱 실행 시 불러옴

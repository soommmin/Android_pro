# part2-chapter4

## 깃허브 레포지토리 조회앱

<img src="https://github.com/soommmin/part2-chapter4/assets/150005268/7a8ff803-87f1-4869-b73d-9d1387ae9d54" width="200" height="400"/>
<img src="https://github.com/soommmin/part2-chapter4/assets/150005268/9ea734a3-ee5f-47bc-b1e7-0ecd2cc14c03" width="200" height="400"/>
<img src="https://github.com/soommmin/part2-chapter4/assets/150005268/8b4dd31a-eb79-4297-8739-7181197e768c" width="200" height="400"/>


깃허브 레포지토리 조회 앱을 통해 Github Open API를 활용하여 키워드로 레포지토리를 검색할 수 있습니다.
RecyclerView와 ListAdapter를 사용하여 검색 결과를 효과적으로 목록으로 표시합니다.
선택한 레포지토리의 상세 정보를 확인할 수 있습니다.


## What I Learned
1. Retrofit
2. Github Open API
3. RecyclerView
4. ListAdapter
5. Handler

### Retrofit
Retrofit은 안드로이드 앱에서 서버와의 통신을 간편하게 처리할 수 있는 라이브러리입니다. 이 앱에서는 Retrofit을 활용하여 Github Open API와 손쉽게 통신하여 데이터를 주고 받습니다.

### Github Open API
깃허브에서 제공하는 Open API를 통해 레포지토리 관련 정보를 얻어옵니다. 사용자는 이를 통해 깃허브의 다양한 레포지토리를 검색하고 조회할 수 있습니다.

### RecyclerView 및 ListAdapter
RecyclerView는 대량의 데이터를 효과적으로 표시하고 스크롤할 수 있는 위젯입니다. ListAdapter를 활용하여 데이터의 변경을 감지하고 효율적으로 뷰를 갱신합니다. 이를 통해 사용자는 쉽게 레포지토리 목록을 스크롤하며 확인할 수 있습니다.

### Handler
Handler를 사용하여 백그라운드 스레드에서 UI 갱신을 수행합니다. 이를 통해 네트워크 요청 등의 작업을 비동기적으로 처리하면서도 UI를 부드럽게 업데이트할 수 있습니다.




# AppEightPhotoAlbum
## Intent - explicit
- 명시적 인텐트 : 특정 액티비티의 시작을 요청할 때, 주로 같은 앱에 있는 액티비티를 시작시킬 때 사용
```
val intent = Intent(this, Activity::class.java) // 인텐트 생성
intent.putExtra("data", "1")
startActivity(intent)
```
AppEightPhotoAlbum에서 [Intent](https://github.com/okrecords/AppEightPhotoAlbum/blob/6ab5a7798535f9e4b3d4d7e6a506469c60ece72b/app/src/main/java/com/okre/appeightphotoalbum/MainActivity.kt#L25)
<br/><br/><br/>

## Splash Screen
- 앱이 실행될 때 보통 500ms ~ 3000ms 동안 splash 화면 보여주고 다음 Activity 실행
```
Handler(Looper.getMainLooper()).postDelayed({
    startActivity(Intent(this, MainActivity::class.java))
    finish()
}, 1500)
```
AppEightPhotoAlbum에서 [Splash Screen](https://github.com/okrecords/AppEightPhotoAlbum/blob/6ab5a7798535f9e4b3d4d7e6a506469c60ece72b/app/src/main/java/com/okre/appeightphotoalbum/SplashActivity.kt#L14)
<br/><br/><br/>

## CardView
- 비슷한 스타일의 컨테이너를 일관된 카드 모양으로 표시하는 방법
- 모서리 반경 설정
```
<androidx.cardview.widget.CardView
    app:cardCornerRadius="25dp">
```
AppEightPhotoAlbum에서 [CardView](https://github.com/okrecords/AppEightPhotoAlbum/blob/6ab5a7798535f9e4b3d4d7e6a506469c60ece72b/app/src/main/res/layout/activity_main.xml#L15)
<br/><br/><br/>
  
## scaleType
- ImageView의 속성
- 옵션 값에 따라 이미지 비율, 크기 등이 다르게 출력 [참고 블로그](https://sharp57dev.tistory.com/23)
```
// fitXY : 가로/세로 비율에 상관없이 ImageView의 레이아웃의 각 면에 꽉 차게 출력
<ImageView
    android:scaleType="fitXY" />
```
AppEightPhotoAlbum에서 [scaleType](https://github.com/okrecords/AppEightPhotoAlbum/blob/6ab5a7798535f9e4b3d4d7e6a506469c60ece72b/app/src/main/res/layout/activity_main.xml#L25)


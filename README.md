# e-mo
## 製品概要
### e-Tech(education-Tech&e-Learning-Tech）

### 背景（製品開発のきっかけ、課題等）
e-moというのは、現状のe-Learningに__感情測定システム__と__DeepLearning__を組みこんだもので、  
生徒全員の感情データを集計し、先生にフィードバックすることができるシステムです。  
これをつかってe-Learningの授業を先生と同じ教室で受ける授業に近づけることが目的です。  

e-Learningというのはインターネットを使って授業などを受けるというもので  
昔は録画したものを利用するのが一般的でしたが  
リアルタイムで授業を受ける遠隔授業e-Learningが増えてきています。  
遠隔授業型e-Learningは日本や世界で教員不足の問題や指導力不足教員を解決するとして  
国家戦略に組み込まれるなど注目されています。  
実際に私たちは授業をする教員・授業を受ける生徒、どちらの立場でもe-Learningをつかっています。  
現状ではチャットやカメラ、アンケートなどの機能で対面の授業との差を埋める対策をしていますが  
__これにはカメラが生徒全員を常に表示することができず、  
生徒がアクションを起こさないと生徒の状況が分からないという問題があります。__  
生徒は分かっていなくてもわかったふりをしてしまうことが多く、  
 __対面の授業では表情や行動をみて把握できますがそれは現状のe-Learningではできません。__  

対面授業とe-Learning、どちらでも使える環境において対面授業を選ぶという生徒教員__1,457名に調査__を行いました。  
そこで見えてきたのは、授業が一方的だという私たちと同じような不満を感じていて、  
__解消されるのならばe-Learningの方がよい__と感じているということです。 

そこで、私たちはe-Learning補助システムe-moを開発しました。  
そして、作成中に気付いたことがあります。  
それは現在の感情表現データセットは欧米人データの基準で作られていることです。  
__90%の適合率と公式の発表でしたが、日本人学生1,000人に協力してもらい試験したところ72%まで下がってしまいました。__  
これは大きなチャンスです。  
最新のデータセットですらデータが偏っているので私たちのシステムにDeepLearningを組み込むことによって   
__発展途上の国でもe-Learningは使われているので、世界中の国ごとに感情データを収集することができます。__  
システムの精度があがるだけでなく、__教育以外にも幅広い活用を見込め公益性、収益性に優れたプロダクトです。__      　　

### 製品説明（具体的な製品の説明）
### 特長
####1.e-Learning授業が柔軟なものに！   
このシステムは、他社のシステムと同時起動するもので接続している生徒全員の感情データを集計し、    
その数値によって、顔のイラストやグラフがリアルタイムで変化していくというものです。  
満足度に合わせたイラストでインパクトを持たせ説明中でも満足度の確認が容易になることで    
授業が生徒の反応にあった柔軟な授業になります。  
たグラフを表示することによってどの説明時点で変化が訪れたのか教員が把握できるようになり    
その点を授業に工夫を凝らすことができます。  
さらに補助的な機能として、生徒にはコメント入力欄のみを表示して満足度が一定値を切ったときには    
メッセージを表示し質問を促します。  
これらの機能によって現在抱かれているe-Learningの不満を解消します。  

####2. 実施している国ごとの感情表現データセットを作成！
発展途上の国でもe-Learningは使われているので、世界中の国ごとに感情データを収集することができる。  
システムの精度があがるだけでなく、教育以外にも幅広い活用を見込め公益性、収益性に優れたプロダクトです。  

### 解決出来ること
・国によるe-Learningの推進に対する現場の生徒や教員の不満を軽減  
・現状のe-Learningが抱いている生徒のアウトプットが必要になってしまう問題を解決  
・感情表現データセットが欧米人のデータが主体になってしまっている問題を解決  
・教員の創意工夫が生きる授業に遠隔授業型e-Learningを変えます！  

### 今後の展望
DeepLearningに使用するTensorFlowが会場の通信環境では実行すると負荷がかかり  
製品の重要なポイントであるリアルタイム性に大きな支障をきたす為、
データベースに解析するために必要なデータを格納するのみに留めました。
今後の展望はそれを利用してデータセットを作成し、  
データセットの販売や別な感情測定を利用したプロダクトに利用する見込みです。


## 開発技術







### 活用した外部技術

#### API・データ

* なし




#### フレームワーク・ライブラリ・モジュール

* デスクトップアプリ




         C#  intel RealSense SDK




* フロントエンド




         Bootstrap




* サーバーサイド




         ruby on rails  postgreSQL  heroku  




* 通信技術




         websocket




#### デバイス

* windows

* Intel® RealSense™ Developer Kit (SR300)




### 独自技術　//kondou




#### 期間中に開発した独自機能・技術

* 







#### 研究内容

* TensorFlowによるデータ解析研究  
  データの分析に使用するデータの抽出項目とその方法について研究を利用しました。
* e-Learningに対する利用状況と不満点への調査研究  
  市場、ニーズの調査と不満点を解決するメソッドについて利用しました。	


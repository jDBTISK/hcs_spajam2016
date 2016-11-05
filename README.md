# e-mo
## 製品概要
### e-Tech(education-Tech,e-Learning-Tech）

### 背景（製品開発のきっかけ、課題等）
e-moというのは、現状のe-Learningに感情測定システムとディープラーニングを組みこんだもので、  
生徒全員の感情データを集計し、先生にフィードバックすることができるシステムです。  
これをつかってe-Learningの授業を先生と同じ教室で受ける授業に近づけることが目的です。  

e-Learningというのはインターネットを使って授業などを受けるというもので  
昔は録画したものを利用するのが一般的でしたが  
リアルタイムで授業を受ける遠隔授業e-Learningが増えてきています。  
遠隔授業型e-Learningは日本や世界で教員不足の問題や指導力不足教員を解決するとして  
国家戦略に組み込まれるなど注目されています。  
実際に私たちは*授業をする教員*　授業を受ける生徒　どちらの立場でもe-Learningをつかっています。  
現状ではチャットやカメラ、アンケートなどの機能で対面の授業との差を埋める対策をしていますが  
これにはカメラが生徒全員を常に表示することができず、  
生徒がアクションを起こさないと生徒の状況が分からないという問題があります。  
生徒は分かっていなくてもわかったふりをしてしまうことが多く、  
対面の授業では表情や行動をみて把握できますがそれは現状のe-Learningではできません。  

対面授業とe-Learning、どちらでも使える環境において対面を選ぶという生徒教員1017名に調査を行いました。  
そこで見えてきたのは、授業が一方向的だという私たちと同じような不満を感じていて、  
解消されるのならばe-Learningの方がよいと感じているということです。 

そこで、私たちはe-Learning補助システムe-moを開発しました。  
そして、作成中に気付いたことがあります。  
それは現在の感情表現データセットは欧米人基準で作られていることです。  
90%の適合率と公式の発表でしたが、学生1000人に協力してもらい試験したところ70%まで下がってしまいました。  
これは大きなチャンスです。  
最新のデータセットですらデータが偏っているので私たちのシステムにディープラーニングを組み込むことによって   
発展途上の国でもe-Learningは使われているので、世界中の国ごとに感情データを収集することができます。  
システムの精度があがるだけでなく、教育以外にも幅広い活用を見込め公益性、収益性に優れたプロダクトです。    　　

### 製品説明（具体的な製品の説明）
### 特長
####1.e-Learning授業が柔軟なものに!  
このシステムは、他社のシステムと同時起動するもので接続している生徒全員の感情データを集計し、    
その数値によって、顔のイラストやグラフがリアルタイムで変化していくというものです。  
理解度に合わせたイラストでインパクトを持たせ説明中でも理解度の確認が容易になることで    
授業が生徒の反応にあった柔軟な授業になります。  
またグラフを表示することによってどの説明時点で変化が訪れたのか教員が把握できるようになり    
その点を授業に工夫を凝らすことができます。  
さらに補助的な機能として、生徒にはコメント入力欄のみを表示して理解度が一定値を切ったときには    
ウィンドウを点滅させて質問を促します。  
これらの機能によって現在抱かれているe-Learningの不満を解消します！  

####2. 世界中の感情表現データセットを作成！
発展途上の国でもe-Learningは使われているので、世界中の国ごとに感情データを収集することができる。  
システムの精度があがるだけでなく、教育以外にも幅広い活用を見込め公益性、収益性に優れたプロダクトです。  

####3. 特長3



### 活用した外部技術
#### API・データ
* なし

#### フレームワーク・ライブラリ・モジュール
* デスクトップアプリ

         C#  intel RealSense SDK

* フロントエンド

         Bootstrap

* サーバーサイド

         ruby on rails  postgreSQL  heroku  

* 通信技術

         websocket

#### デバイス
* windows
* Intel® RealSense™ Developer Kit (SR300)

### 独自技術　//kondou

#### 期間中に開発した独自機能・技術
* 


#### 研究内容（任意）
* もし、製品に研究内容を用いた場合は、研究内容の詳細及び具体的な活用法について、こちらに記載をしてください。

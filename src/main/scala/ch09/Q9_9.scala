package ch09

import ch08.EkimeiT

object Q9_9 {
  val globalEkimeiList = List(
    EkimeiT("代々木上原", "よよぎうえはら", "yoyogiuehara", "千代田線"),
    EkimeiT("代々木公園", "よよぎこうえん", "yoyogikouen", "千代田線"),
    EkimeiT("明治神宮前", "めいじじんぐうまえ", "meijijinguumae", "千代田線"),
    EkimeiT("表参道", "おもてさんどう", "omotesandou", "千代田線"),
    EkimeiT("乃木坂", "のぎざか", "nogizaka", "千代田線"),
    EkimeiT("赤坂", "あかさか", "akasaka", "千代田線"),
    EkimeiT("国会議事堂前", "こっかいぎじどうまえ", "kokkaigijidoumae", "千代田線"),
    EkimeiT("霞ヶ関", "かすみがせき", "kasumigaseki", "千代田線"),
    EkimeiT("日比谷", "ひびや", "hibiya", "千代田線"),
    EkimeiT("二重橋前", "にじゅうばしまえ", "nijuubasimae", "千代田線"),
    EkimeiT("大手町", "おおてまち", "otemachi", "千代田線"),
    EkimeiT("新御茶ノ水", "しんおちゃのみず", "shin-ochanomizu", "千代田線"),
    EkimeiT("湯島", "ゆしま", "yushima", "千代田線"),
    EkimeiT("根津", "ねづ", "nedu", "千代田線"),
    EkimeiT("千駄木", "せんだぎ", "sendagi", "千代田線"),
    EkimeiT("西日暮里", "にしにっぽり", "nishinippori", "千代田線"),
    EkimeiT("町屋", "まちや", "machiya", "千代田線"),
    EkimeiT("北千住", "きたせんじゅ", "kitasenjyu", "千代田線"),
    EkimeiT("綾瀬", "あやせ", "ayase", "千代田線"),
    EkimeiT("北綾瀬", "きたあやせ", "kitaayase", "千代田線"),
    EkimeiT("浅草", "あさくさ", "asakusa", "銀座線"),
    EkimeiT("田原町", "たわらまち", "tawaramachi", "銀座線"),
    EkimeiT("稲荷町", "いなりちょう", "inaricho", "銀座線"),
    EkimeiT("上野", "うえの", "ueno", "銀座線"),
    EkimeiT("上野広小路", "うえのひろこうじ", "uenohirokoji", "銀座線"),
    EkimeiT("末広町", "すえひろちょう", "suehirocho", "銀座線"),
    EkimeiT("神田", "かんだ", "kanda", "銀座線"),
    EkimeiT("三越前", "みつこしまえ", "mitsukoshimae", "銀座線"),
    EkimeiT("日本橋", "にほんばし", "nihonbashi", "銀座線"),
    EkimeiT("京橋", "きょうばし", "kyobashi", "銀座線"),
    EkimeiT("銀座", "ぎんざ", "ginza", "銀座線"),
    EkimeiT("新橋", "しんばし", "shinbashi", "銀座線"),
    EkimeiT("虎ノ門", "とらのもん", "toranomon", "銀座線"),
    EkimeiT("溜池山王", "ためいけさんのう", "tameikesannou", "銀座線"),
    EkimeiT("赤坂見附", "あかさかみつけ", "akasakamitsuke", "銀座線"),
    EkimeiT("青山一丁目", "あおやまいっちょうめ", "aoyamaicchome", "銀座線"),
    EkimeiT("外苑前", "がいえんまえ", "gaienmae", "銀座線"),
    EkimeiT("表参道", "おもてさんどう", "omotesando", "銀座線"),
    EkimeiT("渋谷", "しぶや", "shibuya", "銀座線"),
    EkimeiT("渋谷", "しぶや", "shibuya", "半蔵門線"),
    EkimeiT("表参道", "おもてさんどう", "omotesandou", "半蔵門線"),
    EkimeiT("青山一丁目", "あおやまいっちょうめ", "aoyama-itchome", "半蔵門線"),
    EkimeiT("永田町", "ながたちょう", "nagatacho", "半蔵門線"),
    EkimeiT("半蔵門", "はんぞうもん", "hanzomon", "半蔵門線"),
    EkimeiT("九段下", "くだんした", "kudanshita", "半蔵門線"),
    EkimeiT("神保町", "じんぼうちょう", "jinbocho", "半蔵門線"),
    EkimeiT("大手町", "おおてまち", "otemachi", "半蔵門線"),
    EkimeiT("三越前", "みつこしまえ", "mitsukoshimae", "半蔵門線"),
    EkimeiT("水天宮前", "すいてんぐうまえ", "suitengumae", "半蔵門線"),
    EkimeiT("清澄白河", "きよすみしらかわ", "kiyosumi-shirakawa", "半蔵門線"),
    EkimeiT("住吉", "すみよし", "sumiyoshi", "半蔵門線"),
    EkimeiT("錦糸町", "きんしちょう", "kinshicho", "半蔵門線"),
    EkimeiT("押上", "おしあげ", "oshiage", "半蔵門線"),
    EkimeiT("中目黒", "なかめぐろ", "nakameguro", "日比谷線"),
    EkimeiT("恵比寿", "えびす", "ebisu", "日比谷線"),
    EkimeiT("広尾", "ひろお", "hiro", "日比谷線"),
    EkimeiT("六本木", "ろっぽんぎ", "roppongi", "日比谷線"),
    EkimeiT("神谷町", "かみやちょう", "kamiyacho", "日比谷線"),
    EkimeiT("霞ヶ関", "かすみがせき", "kasumigaseki", "日比谷線"),
    EkimeiT("日比谷", "ひびや", "hibiya", "日比谷線"),
    EkimeiT("銀座", "ぎんざ", "ginza", "日比谷線"),
    EkimeiT("東銀座", "ひがしぎんざ", "higashiginza", "日比谷線"),
    EkimeiT("築地", "つきじ", "tsukiji", "日比谷線"),
    EkimeiT("八丁堀", "はっちょうぼり", "hacchobori", "日比谷線"),
    EkimeiT("茅場町", "かやばちょう", "kayabacho", "日比谷線"),
    EkimeiT("人形町", "にんぎょうちょう", "ningyomachi", "日比谷線"),
    EkimeiT("小伝馬町", "こでんまちょう", "kodemmacho", "日比谷線"),
    EkimeiT("秋葉原", "あきはばら", "akihabara", "日比谷線"),
    EkimeiT("仲御徒町", "なかおかちまち", "nakaokachimachi", "日比谷線"),
    EkimeiT("上野", "うえの", "ueno", "日比谷線"),
    EkimeiT("入谷", "いりや", "iriya", "日比谷線"),
    EkimeiT("三ノ輪", "みのわ", "minowa", "日比谷線"),
    EkimeiT("南千住", "みなみせんじゅ", "minamisenju", "日比谷線"),
    EkimeiT("北千住", "きたせんじゅ", "kitasenju", "日比谷線"),
    EkimeiT("池袋", "いけぶくろ", "ikebukuro", "丸ノ内線"),
    EkimeiT("新大塚", "しんおおつか", "shinotsuka", "丸ノ内線"),
    EkimeiT("茗荷谷", "みょうがだに", "myogadani", "丸ノ内線"),
    EkimeiT("後楽園", "こうらくえん", "korakuen", "丸ノ内線"),
    EkimeiT("本郷三丁目", "ほんごうさんちょうめ", "hongosanchome", "丸ノ内線"),
    EkimeiT("御茶ノ水", "おちゃのみず", "ochanomizu", "丸ノ内線"),
    EkimeiT("淡路町", "あわじちょう", "awajicho", "丸ノ内線"),
    EkimeiT("大手町", "おおてまち", "otemachi", "丸ノ内線"),
    EkimeiT("東京", "とうきょう", "tokyo", "丸ノ内線"),
    EkimeiT("銀座", "ぎんざ", "ginza", "丸ノ内線"),
    EkimeiT("霞ヶ関", "かすみがせき", "kasumigaseki", "丸ノ内線"),
    EkimeiT("国会議事堂前", "こっかいぎじどうまえ", "kokkaigijidomae", "丸ノ内線"),
    EkimeiT("赤坂見附", "あかさかみつけ", "akasakamitsuke", "丸ノ内線"),
    EkimeiT("四ツ谷", "よつや", "yotsuya", "丸ノ内線"),
    EkimeiT("四谷三丁目", "よつやさんちょうめ", "yotsuyasanchome", "丸ノ内線"),
    EkimeiT("新宿御苑前", "しんじゅくぎょえんまえ", "shinjuku-gyoemmae", "丸ノ内線"),
    EkimeiT("新宿三丁目", "しんじゅくさんちょうめ", "shinjuku-sanchome", "丸ノ内線"),
    EkimeiT("新宿", "しんじゅく", "shinjuku", "丸ノ内線"),
    EkimeiT("西新宿", "にししんじゅく", "nishi-shinjuku", "丸ノ内線"),
    EkimeiT("中野坂上", "なかのさかうえ", "nakano-sakaue", "丸ノ内線"),
    EkimeiT("新中野", "しんなかの", "shin-nakano", "丸ノ内線"),
    EkimeiT("東高円寺", "ひがしこうえんじ", "higashi-koenji", "丸ノ内線"),
    EkimeiT("新高円寺", "しんこうえんじ", "shin-koenji", "丸ノ内線"),
    EkimeiT("南阿佐ヶ谷", "みなみあさがや", "minami-asagaya", "丸ノ内線"),
    EkimeiT("荻窪", "おぎくぼ", "ogikubo", "丸ノ内線"),
    EkimeiT("中野新橋", "なかのしんばし", "nakano-shimbashi", "丸ノ内線"),
    EkimeiT("中野富士見町", "なかのふじみちょう", "nakano-fujimicho", "丸ノ内線"),
    EkimeiT("方南町", "ほうなんちょう", "honancho", "丸ノ内線"),
    EkimeiT("四ツ谷", "よつや", "yotsuya", "南北線"),
    EkimeiT("永田町", "ながたちょう", "nagatacho", "南北線"),
    EkimeiT("溜池山王", "ためいけさんのう", "tameikesanno", "南北線"),
    EkimeiT("六本木一丁目", "ろっぽんぎいっちょうめ", "roppongiitchome", "南北線"),
    EkimeiT("麻布十番", "あざぶじゅうばん", "azabujuban", "南北線"),
    EkimeiT("白金高輪", "しろかねたかなわ", "shirokanetakanawa", "南北線"),
    EkimeiT("白金台", "しろかねだい", "shirokanedai", "南北線"),
    EkimeiT("目黒", "めぐろ", "meguro", "南北線"),
    EkimeiT("市ヶ谷", "いちがや", "ichigaya", "南北線"),
    EkimeiT("飯田橋", "いいだばし", "idabashi", "南北線"),
    EkimeiT("後楽園", "こうらくえん", "korakuen", "南北線"),
    EkimeiT("東大前", "とうだいまえ", "todaimae", "南北線"),
    EkimeiT("本駒込", "ほんこまごめ", "honkomagome", "南北線"),
    EkimeiT("駒込", "こまごめ", "komagome", "南北線"),
    EkimeiT("西ヶ原", "にしがはら", "nishigahara", "南北線"),
    EkimeiT("王子", "おうじ", "oji", "南北線"),
    EkimeiT("王子神谷", "おうじかみや", "ojikamiya", "南北線"),
    EkimeiT("志茂", "しも", "shimo", "南北線"),
    EkimeiT("赤羽岩淵", "あかばねいわぶち", "akabaneiwabuchi", "南北線"),
    EkimeiT("西船橋", "にしふなばし", "nishi-funabashi", "東西線"),
    EkimeiT("原木中山", "ばらきなかやま", "baraki-nakayama", "東西線"),
    EkimeiT("妙典", "みょうでん", "myoden", "東西線"),
    EkimeiT("行徳", "ぎょうとく", "gyotoku", "東西線"),
    EkimeiT("南行徳", "みなみぎょうとく", "minami-gyotoku", "東西線"),
    EkimeiT("浦安", "うらやす", "urayasu", "東西線"),
    EkimeiT("葛西", "かさい", "kasai", "東西線"),
    EkimeiT("西葛西", "にしかさい", "nishi-kasai", "東西線"),
    EkimeiT("南砂町", "みなみすなまち", "minami-sunamachi", "東西線"),
    EkimeiT("東陽町", "とうようちょう", "touyoucho", "東西線"),
    EkimeiT("木場", "きば", "kiba", "東西線"),
    EkimeiT("門前仲町", "もんぜんなかちょう", "monzen-nakacho", "東西線"),
    EkimeiT("茅場町", "かやばちょう", "kayabacho", "東西線"),
    EkimeiT("日本橋", "にほんばし", "nihonbashi", "東西線"),
    EkimeiT("大手町", "おおてまち", "otemachi", "東西線"),
    EkimeiT("竹橋", "たけばし", "takebashi", "東西線"),
    EkimeiT("九段下", "くだんした", "kudanshita", "東西線"),
    EkimeiT("飯田橋", "いいだばし", "iidabashi", "東西線"),
    EkimeiT("神楽坂", "かぐらざか", "kagurazaka", "東西線"),
    EkimeiT("早稲田", "わせだ", "waseda", "東西線"),
    EkimeiT("高田馬場", "たかだのばば", "takadanobaba", "東西線"),
    EkimeiT("落合", "おちあい", "ochiai", "東西線"),
    EkimeiT("中野", "なかの", "nakano", "東西線"),
    EkimeiT("しんきば", "新木場", "shinkiba", "有楽町線"),
    EkimeiT("たつみ", "辰巳", "tatsumi", "有楽町線"),
    EkimeiT("とよす", "豊洲", "toyosu", "有楽町線"),
    EkimeiT("つきしま", "月島", "tsukishima", "有楽町線"),
    EkimeiT("しんとみちょう", "新富町", "shintomityou", "有楽町線"),
    EkimeiT("ぎんざいっちょうめ", "銀座一丁目", "ginzaittyoume", "有楽町線"),
    EkimeiT("ゆうらくちょう", "有楽町", "yuurakutyou", "有楽町線"),
    EkimeiT("さくらだもん", "桜田門", "sakuradamon", "有楽町線"),
    EkimeiT("ながたちょう", "永田町", "nagatacho", "有楽町線"),
    EkimeiT("こうじまち", "麹町", "koujimachi", "有楽町線"),
    EkimeiT("いちがや", "市ヶ谷", "ichigaya", "有楽町線"),
    EkimeiT("いいだばし", "飯田橋", "iidabashi", "有楽町線"),
    EkimeiT("江戸川橋", "えどがわばし", "edogawabasi", "有楽町線"),
    EkimeiT("護国寺", "ごこくじ", "gokokuji", "有楽町線"),
    EkimeiT("東池袋", "ひがしいけぶくろ", "higasiikebukuro", "有楽町線"),
    EkimeiT("池袋", "いけぶくろ", "ikebukuro", "有楽町線"),
    EkimeiT("要町", "かなめちょう", "kanametyou", "有楽町線"),
    EkimeiT("千川", "せんかわ", "senkawa", "有楽町線"),
    EkimeiT("小竹向原", "こたけむかいはら", "kotakemukaihara", "有楽町線"),
    EkimeiT("氷川台", "ひかわだい", "hikawadai", "有楽町線"),
    EkimeiT("平和台", "へいわだい", "heiwadai", "有楽町線"),
    EkimeiT("営団赤塚", "えいだんあかつか", "eidanakakuka", "有楽町線"),
    EkimeiT("営団成増", "えいだんなります", "eidannarimasu", "有楽町線"),
    EkimeiT("和光市", "わこうし", "wakousi", "有楽町線")
  )
}

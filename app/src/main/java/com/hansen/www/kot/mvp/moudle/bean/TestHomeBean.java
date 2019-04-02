package com.hansen.www.kot.mvp.moudle.bean;

import java.util.List;

/**
 * 创建者 by ${HanSir} on 2018/11/22.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class TestHomeBean {

    /**
     * issueList : [{"releaseTime":1542848400000,"type":"morning","date":1542848400000,"publishTime":1542848400000,"itemList":[{"type":"banner2","data":{"dataType":"Banner","id":0,"title":"","description":"","image":"http://img.kaiyanapp.com/eef24aa10ab6cf17b5a512943ec22053.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"","adTrack":null,"shade":false,"label":null,"labelList":null,"header":null,"autoPlay":false},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":138575,"title":"苹果暖心圣诞广告：秀出你的才华","description":"圣诞是交换礼物的节日，英文「gift」既有礼物也有天赋的意思。此次苹果以这个作为切入点，讲述一个很有天赋的女孩 Sofia 却不敢展示自己的作品，直到一次意外\u2026\u2026永远别害怕展示自己的天赋，因为那是上天给你最好的礼物。BGM：Billie Eilish「Come Out and Play」","library":"DAILY","tags":[{"id":748,"name":"广告精选","actionUrl":"eyepetizer://tag/748/?title=%E5%B9%BF%E5%91%8A%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9056413cfeffaf0c841d894390aa8e08.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ff0f6d0ad5f4b6211a3f746aaaffd916.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":769,"name":"广告里的神奇动物","actionUrl":"eyepetizer://tag/769/?title=%E5%B9%BF%E5%91%8A%E9%87%8C%E7%9A%84%E7%A5%9E%E5%A5%87%E5%8A%A8%E7%89%A9","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/11d9c86461714fe16b8e4dc3f6549eec.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/11d9c86461714fe16b8e4dc3f6549eec.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":398,"name":"品牌短片","actionUrl":"eyepetizer://tag/398/?title=%E5%93%81%E7%89%8C%E7%9F%AD%E7%89%87","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":764,"name":"温情广告","actionUrl":"eyepetizer://tag/764/?title=%E6%B8%A9%E6%83%85%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/82f55cd5752d6493e31a9c8b4a2ef22d.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/82f55cd5752d6493e31a9c8b4a2ef22d.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":759,"name":"动画广告","actionUrl":"eyepetizer://tag/759/?title=%E5%8A%A8%E7%94%BB%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/7c18b931c3c76a702dd3dabd03d9f9dd.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/7c18b931c3c76a702dd3dabd03d9f9dd.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":770,"name":"科技广告","actionUrl":"eyepetizer://tag/770/?title=%E7%A7%91%E6%8A%80%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/ad50cc00738fecb7033b210e751bde52.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ad50cc00738fecb7033b210e751bde52.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":450,"name":"Apple","actionUrl":"eyepetizer://tag/450/?title=Apple","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/b9c9e5b6ec99f982b07dba9a25d7f29c.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/b9c9e5b6ec99f982b07dba9a25d7f29c.png?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":136,"name":"温情","actionUrl":"eyepetizer://tag/136/?title=%E6%B8%A9%E6%83%85","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/0bc1dc78c631eae017ee69418303adc5.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/0bc1dc78c631eae017ee69418303adc5.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":758,"name":"欧美广告","actionUrl":"eyepetizer://tag/758/?title=%E6%AC%A7%E7%BE%8E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/4347ee94f8ae98a86f2913db3b8638f3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/8494d3626c41f8e8cb6316767cc0f573.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0}],"consumption":{"collectionCount":138,"shareCount":128,"replyCount":2},"resourceType":"video","slogan":"别害怕，勇敢展示你的天赋","provider":{"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"},"category":"广告","author":{"id":3462,"icon":"http://img.kaiyanapp.com/c643fc4c57f32e734de32689b67a1f0a.png?imageMogr2/quality/60/format/jpg","name":"Apple 苹果","description":"苹果公司「Apple Inc.」是总部位于美国加州库比蒂诺的跨国科技公司。创立于 1976 年 4 月 1 日，业务包括设计、开发和销售消费电子、计算机软件、在线服务和个人计算机。","link":"","latestReleaseTime":1542848400000,"videoNum":30,"adTrack":null,"follow":{"itemType":"author","itemId":3462,"followed":false},"shield":{"itemType":"author","itemId":3462,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/e501edd18e6c84130828c95111629c6b.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/e501edd18e6c84130828c95111629c6b.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/12ee971a04027456d508577ad084d228.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/e501edd18e6c84130828c95111629c6b.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138575&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":172,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=138575","forWeibo":"http://www.eyepetizer.net/detail.html?vid=138575&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1542848400000,"playInfo":[{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138575&resourceType=video&editionType=high&source=aliyun","size":21704824},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138575&resourceType=video&editionType=high&source=qcloud","size":21704824},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138575&resourceType=video&editionType=high&source=ucloud","size":21704824}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138575&resourceType=video&editionType=high&source=aliyun"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":null,"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":null,"ifLimitVideo":false,"searchWeight":0,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1542848400000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"圣诞是交换礼物的节日，英文「gift」既有礼物也有天赋的意思。此次苹果以这个作为切入点，讲述一个很有天赋的女孩 Sofia 却不敢展示自己的作品，直到一次意外\u2026\u2026永远别害怕展示自己的天赋，因为那是上天给你最好的礼物。BGM：Billie Eilish「Come Out and Play」","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":138627,"title":"开眼制作首档网综「知乎者耶」第二期","description":"灭霸，作为 2018 年全球电影大荧幕最可怕的终极 Boss，他坚信宇宙清除了一半生命后，将会变得更加美好。你相信宇宙清除了一半生命后，它就会变得更加美好吗？灭霸的行为到底是精明还是愚蠢？他对宇宙的未来是不是在瞎操心？从经济学角度看，如何评价灭霸的行为？「知乎者耶」第二期来啦！这次，我们又邀请到了 5 位新的知友，回答「如何评价灭霸清除宇宙一半生命的计划？」这一问题。","library":"DAILY","tags":[{"id":504,"name":"笑cry","actionUrl":"eyepetizer://tag/504/?title=%E7%AC%91cry","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/3d3cb19d13cc16e8c3c2eddb12284fa3.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/177986653f12273f6d55edafe856ffe3.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":460,"name":"复仇者联盟","actionUrl":"eyepetizer://tag/460/?title=%E5%A4%8D%E4%BB%87%E8%80%85%E8%81%94%E7%9B%9F","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9623d26752a5897f4e8fc7beab673da0.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/9623d26752a5897f4e8fc7beab673da0.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":406,"name":"漫威","actionUrl":"eyepetizer://tag/406/?title=%E6%BC%AB%E5%A8%81","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/19e0cc9af45edd72c76637135ca30f85.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/19e0cc9af45edd72c76637135ca30f85.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":50,"name":"脱口秀","actionUrl":"eyepetizer://tag/50/?title=%E8%84%B1%E5%8F%A3%E7%A7%80","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/a99318890da2d383eae0388e06071b41.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/a99318890da2d383eae0388e06071b41.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":28,"name":"综艺","actionUrl":"eyepetizer://tag/28/?title=%E7%BB%BC%E8%89%BA","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/d67f739fba330099b515c3b92fccfd91.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/d67f739fba330099b515c3b92fccfd91.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0}],"consumption":{"collectionCount":206,"shareCount":48,"replyCount":15},"resourceType":"video","slogan":"再次向「漫威之父」斯坦·李致敬","provider":{"name":"投稿","alias":"PGC2","icon":""},"category":"综艺","author":{"id":2174,"icon":"http://img.kaiyanapp.com/9f4c1559d54d4274e5463fba4262b284.jpeg","name":"开眼综艺精选","description":"全球网红在表演什么","link":"","latestReleaseTime":1542800247000,"videoNum":145,"adTrack":null,"follow":{"itemType":"author","itemId":2174,"followed":false},"shield":{"itemType":"author","itemId":2174,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/b489a215b3932f6d909c35a76417933b.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/b489a215b3932f6d909c35a76417933b.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/5f375e4794e89adb65c68fc9355e5ee3.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/b489a215b3932f6d909c35a76417933b.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138627&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":"","duration":1930,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=138627","forWeibo":"http://www.eyepetizer.net/detail.html?vid=138627"},"releaseTime":1542800247000,"playInfo":[{"height":1080,"width":1920,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138627&resourceType=video&editionType=high&source=aliyun","size":942967426},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138627&resourceType=video&editionType=high&source=qcloud","size":942967426},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138627&resourceType=video&editionType=high&source=ucloud","size":942967426}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138627&resourceType=video&editionType=high&source=aliyun"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":null,"type":"NORMAL","titlePgc":"","descriptionPgc":"","remark":null,"ifLimitVideo":false,"searchWeight":0,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1542848400000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"灭霸，作为 2018 年全球电影大荧幕最可怕的终极 Boss，他坚信宇宙清除了一半生命后，将会变得更加美好。你相信宇宙清除了一半生命后，它就会变得更加美好吗？灭霸的行为到底是精明还是愚蠢？他对宇宙的未来是不是在瞎操心？从经济学角度看，如何评价灭霸的行为？「知乎者耶」第二期来啦！这次，我们又邀请到了 5 位新的知友，回答「如何评价灭霸清除宇宙一半生命的计划？」这一问题。","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":137713,"title":"生活无趣？点点鼠标就能获得快乐","description":"觉得生活无趣？那可能是你的打开方式不对。来自俄罗斯的创作者 Tomin 用创意和技术让日常生活里平白无奇的物体瞬间生动起来。其实生活处处有惊喜，重要的是换个角度换个心情。From Tomin","library":"DAILY","tags":[{"id":744,"name":"创意灵感","actionUrl":"eyepetizer://tag/744/?title=%E5%88%9B%E6%84%8F%E7%81%B5%E6%84%9F","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/bc2479c09cd15cb93b69d82e5f21c3fc.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/bc2479c09cd15cb93b69d82e5f21c3fc.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":94,"name":"实验性","actionUrl":"eyepetizer://tag/94/?title=%E5%AE%9E%E9%AA%8C%E6%80%A7","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/e1a1a2b35f6916636594fe6bff4c5050.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/4aae1da4cea59eb15007e8d306c6eaea.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":92,"name":"超现实","actionUrl":"eyepetizer://tag/92/?title=%E8%B6%85%E7%8E%B0%E5%AE%9E","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/16acd1adf55e68599a12ea7811859b68.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/f27c0aebc383b65f3e47af443f0a07ce.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":2,"name":"创意","actionUrl":"eyepetizer://tag/2/?title=%E5%88%9B%E6%84%8F","adTrack":null,"desc":"","bgPicture":"http://img.kaiyanapp.com/1b457058cf2b317304ff9f70543c040d.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/fdefdb34cbe3d2ac9964d306febe9025.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0}],"consumption":{"collectionCount":231,"shareCount":68,"replyCount":2},"resourceType":"video","slogan":"超现实脑洞短片：写生","provider":{"name":"Vimeo","alias":"vimeo","icon":"http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png"},"category":"创意","author":{"id":2161,"icon":"http://img.kaiyanapp.com/f4a9aba1c6857ee0cefcdc5aee0a1fc9.png?imageMogr2/quality/60/format/jpg","name":"开眼创意精选","description":"技术与审美结合，探索视觉的无限可能","link":"","latestReleaseTime":1542643262000,"videoNum":586,"adTrack":null,"follow":{"itemType":"author","itemId":2161,"followed":false},"shield":{"itemType":"author","itemId":2161,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/19f5fbf2dd29231ad8e717d267923256.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/19f5fbf2dd29231ad8e717d267923256.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/482b60b9b2066aecc7f4119165096bd5.png?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/19f5fbf2dd29231ad8e717d267923256.png?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137713&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":129,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=137713","forWeibo":"http://www.eyepetizer.net/detail.html?vid=137713"},"releaseTime":1542643262000,"playInfo":[],"campaign":null,"waterMarks":null,"ad":false,"adTrack":null,"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":null,"ifLimitVideo":false,"searchWeight":0,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1542848400000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"觉得生活无趣？那可能是你的打开方式不对。来自俄罗斯的创作者 Tomin 用创意和技术让日常生活里平白无奇的物体瞬间生动起来。其实生活处处有惊喜，重要的是换个角度换个心情。From Tomin","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":137323,"title":"清醒点吧，有一种错觉叫自以为是","description":"你善于赚钱吗？工作能力强吗？心理学研究表明，我们并不擅长准确地评估自己。事实上，我们经常高估自己的能力。","library":"DAILY","tags":[{"id":44,"name":"科普","actionUrl":"eyepetizer://tag/44/?title=%E7%A7%91%E6%99%AE","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f2e7359e81e217782f32cc3d482b3284.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/f2e7359e81e217782f32cc3d482b3284.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":864,"name":"人文社科","actionUrl":"eyepetizer://tag/864/?title=%E4%BA%BA%E6%96%87%E7%A4%BE%E7%A7%91","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/5a24f441d4842d417b67470d71b01fb7.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/5a24f441d4842d417b67470d71b01fb7.png?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":556,"name":"科技","actionUrl":"eyepetizer://tag/556/?title=%E7%A7%91%E6%8A%80","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/27c3e861a02ced6069dd64c977746a61.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/b8a3443f9ff392b22201b74e47995e3c.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0}],"consumption":{"collectionCount":717,"shareCount":288,"replyCount":9},"resourceType":"video","slogan":"别那么骄傲，其实你没那么厉害","provider":{"name":"定制来源","alias":"CustomSrc","icon":""},"category":"科技","author":{"id":2398,"icon":"http://img.kaiyanapp.com/5e4a548d975069f7d7d1b1fe22286b3e.jpeg?imageMogr2/quality/60/format/jpg","name":"TED-Ed","description":"TED-Ed 致力于与更多的动画师和教育学者共同创造出更多优秀的科普视频。","link":"","latestReleaseTime":1542816066000,"videoNum":270,"adTrack":null,"follow":{"itemType":"author","itemId":2398,"followed":false},"shield":{"itemType":"author","itemId":2398,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/e949abd0519390415677911301e5d730.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/e949abd0519390415677911301e5d730.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/81279a1cda89508240859af9ae895f45.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/e949abd0519390415677911301e5d730.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137323&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":307,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=137323","forWeibo":"http://www.eyepetizer.net/detail.html?vid=137323&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1542297605000,"playInfo":[{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137323&resourceType=video&editionType=high&source=aliyun","size":30518083},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137323&resourceType=video&editionType=high&source=qcloud","size":30518083},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137323&resourceType=video&editionType=high&source=ucloud","size":30518083}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137323&resourceType=video&editionType=high&source=aliyun"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":null,"type":"NORMAL","titlePgc":"","descriptionPgc":"","remark":null,"ifLimitVideo":false,"searchWeight":0,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1542848400000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"你善于赚钱吗？工作能力强吗？心理学研究表明，我们并不擅长准确地评估自己。事实上，我们经常高估自己的能力。","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":138012,"title":"史上第一团！5 个男女水下弹唱，全球爆红","description":"在水下一边憋气，一边弹琴唱歌，是怎样的体验？5 个来自丹麦的音乐家，花了十年时间，找到了在水中演奏的方法，组成了世界第一支水下乐队！他们沉入大水缸，唱歌、拉小提琴、打鼓、弹六弦琴\u2026\u2026创造出极为空灵、人们从未听过的音乐。","library":"DAILY","tags":[{"id":743,"name":"记录精选","actionUrl":"eyepetizer://tag/743/?title=%E8%AE%B0%E5%BD%95%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":700,"name":"音乐人","actionUrl":"eyepetizer://tag/700/?title=%E9%9F%B3%E4%B9%90%E4%BA%BA","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f33fd7ec570017c58f9daa43e9d17f36.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/f33fd7ec570017c58f9daa43e9d17f36.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":24,"name":"记录","actionUrl":"eyepetizer://tag/24/?title=%E8%AE%B0%E5%BD%95","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/c3984cad49455e01637347e0c8f6a37d.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/fd76dab1411e07f0dcf45309720134f9.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0}],"consumption":{"collectionCount":145,"shareCount":69,"replyCount":4},"resourceType":"video","slogan":"一边憋气一边弹琴唱歌会怎样？","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"记录","author":{"id":170,"icon":"http://img.kaiyanapp.com/b1f252f2a97e014f6de7e65709c5eedd.png?imageMogr2/quality/60/format/jpg","name":"一条","description":"所有未在美中度过的生活，都是被浪费了。","link":"","latestReleaseTime":1542797376000,"videoNum":1299,"adTrack":null,"follow":{"itemType":"author","itemId":170,"followed":false},"shield":{"itemType":"author","itemId":170,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/e03c16c9d3255b9e54b018e3160bb433.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/e03c16c9d3255b9e54b018e3160bb433.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/ae68c1b5a636149bdcf63e1b2418a8b9.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138012&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":257,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=138012","forWeibo":"http://www.eyepetizer.net/detail.html?vid=138012&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1542548055000,"playInfo":[],"campaign":null,"waterMarks":null,"ad":false,"adTrack":null,"type":"NORMAL","titlePgc":"史上第一团！5个男女水下弹唱，全球爆红","descriptionPgc":"在水下一边憋气，一边弹琴唱歌，是怎样的体验？5个来自丹麦的音乐家，花了十年时间，找到了在水中演奏的方法，组成了世界第一支水下乐队！他们沉入大水缸，唱歌、拉小提琴、打鼓、弹六弦琴\u2026\u2026创造出极为空灵、人们从未听过的音乐。","remark":"","ifLimitVideo":false,"searchWeight":0,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1542848400000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"在水下一边憋气，一边弹琴唱歌，是怎样的体验？5 个来自丹麦的音乐家，花了十年时间，找到了在水中演奏的方法，组成了世界第一支水下乐队！他们沉入大水缸，唱歌、拉小提琴、打鼓、弹六弦琴\u2026\u2026创造出极为空灵、人们从未听过的音乐。","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1}],"count":5}]
     * nextPageUrl : http://baobab.kaiyanapp.com/api/v2/feed?date=1542762000000&num=1
     * nextPublishTime : 1542934800000
     * newestIssueType : morning
     * dialog : null
     */

    private String nextPageUrl;
    private long nextPublishTime;
    private String newestIssueType;
    private Object dialog;
    private List<IssueListBean> issueList;

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public long getNextPublishTime() {
        return nextPublishTime;
    }

    public void setNextPublishTime(long nextPublishTime) {
        this.nextPublishTime = nextPublishTime;
    }

    public String getNewestIssueType() {
        return newestIssueType;
    }

    public void setNewestIssueType(String newestIssueType) {
        this.newestIssueType = newestIssueType;
    }

    public Object getDialog() {
        return dialog;
    }

    public void setDialog(Object dialog) {
        this.dialog = dialog;
    }

    public List<IssueListBean> getIssueList() {
        return issueList;
    }

    public void setIssueList(List<IssueListBean> issueList) {
        this.issueList = issueList;
    }

    public static class IssueListBean {
        /**
         * releaseTime : 1542848400000
         * type : morning
         * date : 1542848400000
         * publishTime : 1542848400000
         * itemList : [{"type":"banner2","data":{"dataType":"Banner","id":0,"title":"","description":"","image":"http://img.kaiyanapp.com/eef24aa10ab6cf17b5a512943ec22053.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"","adTrack":null,"shade":false,"label":null,"labelList":null,"header":null,"autoPlay":false},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":138575,"title":"苹果暖心圣诞广告：秀出你的才华","description":"圣诞是交换礼物的节日，英文「gift」既有礼物也有天赋的意思。此次苹果以这个作为切入点，讲述一个很有天赋的女孩 Sofia 却不敢展示自己的作品，直到一次意外\u2026\u2026永远别害怕展示自己的天赋，因为那是上天给你最好的礼物。BGM：Billie Eilish「Come Out and Play」","library":"DAILY","tags":[{"id":748,"name":"广告精选","actionUrl":"eyepetizer://tag/748/?title=%E5%B9%BF%E5%91%8A%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9056413cfeffaf0c841d894390aa8e08.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ff0f6d0ad5f4b6211a3f746aaaffd916.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":769,"name":"广告里的神奇动物","actionUrl":"eyepetizer://tag/769/?title=%E5%B9%BF%E5%91%8A%E9%87%8C%E7%9A%84%E7%A5%9E%E5%A5%87%E5%8A%A8%E7%89%A9","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/11d9c86461714fe16b8e4dc3f6549eec.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/11d9c86461714fe16b8e4dc3f6549eec.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":398,"name":"品牌短片","actionUrl":"eyepetizer://tag/398/?title=%E5%93%81%E7%89%8C%E7%9F%AD%E7%89%87","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/f30657af97e84d4edf5508ef3908f0b3.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":764,"name":"温情广告","actionUrl":"eyepetizer://tag/764/?title=%E6%B8%A9%E6%83%85%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/82f55cd5752d6493e31a9c8b4a2ef22d.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/82f55cd5752d6493e31a9c8b4a2ef22d.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":759,"name":"动画广告","actionUrl":"eyepetizer://tag/759/?title=%E5%8A%A8%E7%94%BB%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/7c18b931c3c76a702dd3dabd03d9f9dd.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/7c18b931c3c76a702dd3dabd03d9f9dd.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":770,"name":"科技广告","actionUrl":"eyepetizer://tag/770/?title=%E7%A7%91%E6%8A%80%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/ad50cc00738fecb7033b210e751bde52.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ad50cc00738fecb7033b210e751bde52.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":450,"name":"Apple","actionUrl":"eyepetizer://tag/450/?title=Apple","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/b9c9e5b6ec99f982b07dba9a25d7f29c.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/b9c9e5b6ec99f982b07dba9a25d7f29c.png?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":136,"name":"温情","actionUrl":"eyepetizer://tag/136/?title=%E6%B8%A9%E6%83%85","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/0bc1dc78c631eae017ee69418303adc5.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/0bc1dc78c631eae017ee69418303adc5.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":758,"name":"欧美广告","actionUrl":"eyepetizer://tag/758/?title=%E6%AC%A7%E7%BE%8E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/4347ee94f8ae98a86f2913db3b8638f3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/8494d3626c41f8e8cb6316767cc0f573.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0}],"consumption":{"collectionCount":138,"shareCount":128,"replyCount":2},"resourceType":"video","slogan":"别害怕，勇敢展示你的天赋","provider":{"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"},"category":"广告","author":{"id":3462,"icon":"http://img.kaiyanapp.com/c643fc4c57f32e734de32689b67a1f0a.png?imageMogr2/quality/60/format/jpg","name":"Apple 苹果","description":"苹果公司「Apple Inc.」是总部位于美国加州库比蒂诺的跨国科技公司。创立于 1976 年 4 月 1 日，业务包括设计、开发和销售消费电子、计算机软件、在线服务和个人计算机。","link":"","latestReleaseTime":1542848400000,"videoNum":30,"adTrack":null,"follow":{"itemType":"author","itemId":3462,"followed":false},"shield":{"itemType":"author","itemId":3462,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/e501edd18e6c84130828c95111629c6b.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/e501edd18e6c84130828c95111629c6b.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/12ee971a04027456d508577ad084d228.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/e501edd18e6c84130828c95111629c6b.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138575&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":172,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=138575","forWeibo":"http://www.eyepetizer.net/detail.html?vid=138575&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1542848400000,"playInfo":[{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138575&resourceType=video&editionType=high&source=aliyun","size":21704824},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138575&resourceType=video&editionType=high&source=qcloud","size":21704824},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138575&resourceType=video&editionType=high&source=ucloud","size":21704824}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138575&resourceType=video&editionType=high&source=aliyun"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":null,"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":null,"ifLimitVideo":false,"searchWeight":0,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1542848400000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"圣诞是交换礼物的节日，英文「gift」既有礼物也有天赋的意思。此次苹果以这个作为切入点，讲述一个很有天赋的女孩 Sofia 却不敢展示自己的作品，直到一次意外\u2026\u2026永远别害怕展示自己的天赋，因为那是上天给你最好的礼物。BGM：Billie Eilish「Come Out and Play」","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":138627,"title":"开眼制作首档网综「知乎者耶」第二期","description":"灭霸，作为 2018 年全球电影大荧幕最可怕的终极 Boss，他坚信宇宙清除了一半生命后，将会变得更加美好。你相信宇宙清除了一半生命后，它就会变得更加美好吗？灭霸的行为到底是精明还是愚蠢？他对宇宙的未来是不是在瞎操心？从经济学角度看，如何评价灭霸的行为？「知乎者耶」第二期来啦！这次，我们又邀请到了 5 位新的知友，回答「如何评价灭霸清除宇宙一半生命的计划？」这一问题。","library":"DAILY","tags":[{"id":504,"name":"笑cry","actionUrl":"eyepetizer://tag/504/?title=%E7%AC%91cry","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/3d3cb19d13cc16e8c3c2eddb12284fa3.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/177986653f12273f6d55edafe856ffe3.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":460,"name":"复仇者联盟","actionUrl":"eyepetizer://tag/460/?title=%E5%A4%8D%E4%BB%87%E8%80%85%E8%81%94%E7%9B%9F","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/9623d26752a5897f4e8fc7beab673da0.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/9623d26752a5897f4e8fc7beab673da0.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":406,"name":"漫威","actionUrl":"eyepetizer://tag/406/?title=%E6%BC%AB%E5%A8%81","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/19e0cc9af45edd72c76637135ca30f85.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/19e0cc9af45edd72c76637135ca30f85.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":50,"name":"脱口秀","actionUrl":"eyepetizer://tag/50/?title=%E8%84%B1%E5%8F%A3%E7%A7%80","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/a99318890da2d383eae0388e06071b41.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/a99318890da2d383eae0388e06071b41.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":28,"name":"综艺","actionUrl":"eyepetizer://tag/28/?title=%E7%BB%BC%E8%89%BA","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/d67f739fba330099b515c3b92fccfd91.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/d67f739fba330099b515c3b92fccfd91.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0}],"consumption":{"collectionCount":206,"shareCount":48,"replyCount":15},"resourceType":"video","slogan":"再次向「漫威之父」斯坦·李致敬","provider":{"name":"投稿","alias":"PGC2","icon":""},"category":"综艺","author":{"id":2174,"icon":"http://img.kaiyanapp.com/9f4c1559d54d4274e5463fba4262b284.jpeg","name":"开眼综艺精选","description":"全球网红在表演什么","link":"","latestReleaseTime":1542800247000,"videoNum":145,"adTrack":null,"follow":{"itemType":"author","itemId":2174,"followed":false},"shield":{"itemType":"author","itemId":2174,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/b489a215b3932f6d909c35a76417933b.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/b489a215b3932f6d909c35a76417933b.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/5f375e4794e89adb65c68fc9355e5ee3.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/b489a215b3932f6d909c35a76417933b.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138627&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":"","duration":1930,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=138627","forWeibo":"http://www.eyepetizer.net/detail.html?vid=138627"},"releaseTime":1542800247000,"playInfo":[{"height":1080,"width":1920,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138627&resourceType=video&editionType=high&source=aliyun","size":942967426},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138627&resourceType=video&editionType=high&source=qcloud","size":942967426},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138627&resourceType=video&editionType=high&source=ucloud","size":942967426}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138627&resourceType=video&editionType=high&source=aliyun"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":null,"type":"NORMAL","titlePgc":"","descriptionPgc":"","remark":null,"ifLimitVideo":false,"searchWeight":0,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1542848400000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"灭霸，作为 2018 年全球电影大荧幕最可怕的终极 Boss，他坚信宇宙清除了一半生命后，将会变得更加美好。你相信宇宙清除了一半生命后，它就会变得更加美好吗？灭霸的行为到底是精明还是愚蠢？他对宇宙的未来是不是在瞎操心？从经济学角度看，如何评价灭霸的行为？「知乎者耶」第二期来啦！这次，我们又邀请到了 5 位新的知友，回答「如何评价灭霸清除宇宙一半生命的计划？」这一问题。","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":137713,"title":"生活无趣？点点鼠标就能获得快乐","description":"觉得生活无趣？那可能是你的打开方式不对。来自俄罗斯的创作者 Tomin 用创意和技术让日常生活里平白无奇的物体瞬间生动起来。其实生活处处有惊喜，重要的是换个角度换个心情。From Tomin","library":"DAILY","tags":[{"id":744,"name":"创意灵感","actionUrl":"eyepetizer://tag/744/?title=%E5%88%9B%E6%84%8F%E7%81%B5%E6%84%9F","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/bc2479c09cd15cb93b69d82e5f21c3fc.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/bc2479c09cd15cb93b69d82e5f21c3fc.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":94,"name":"实验性","actionUrl":"eyepetizer://tag/94/?title=%E5%AE%9E%E9%AA%8C%E6%80%A7","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/e1a1a2b35f6916636594fe6bff4c5050.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/4aae1da4cea59eb15007e8d306c6eaea.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":92,"name":"超现实","actionUrl":"eyepetizer://tag/92/?title=%E8%B6%85%E7%8E%B0%E5%AE%9E","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/16acd1adf55e68599a12ea7811859b68.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/f27c0aebc383b65f3e47af443f0a07ce.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":2,"name":"创意","actionUrl":"eyepetizer://tag/2/?title=%E5%88%9B%E6%84%8F","adTrack":null,"desc":"","bgPicture":"http://img.kaiyanapp.com/1b457058cf2b317304ff9f70543c040d.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/fdefdb34cbe3d2ac9964d306febe9025.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0}],"consumption":{"collectionCount":231,"shareCount":68,"replyCount":2},"resourceType":"video","slogan":"超现实脑洞短片：写生","provider":{"name":"Vimeo","alias":"vimeo","icon":"http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png"},"category":"创意","author":{"id":2161,"icon":"http://img.kaiyanapp.com/f4a9aba1c6857ee0cefcdc5aee0a1fc9.png?imageMogr2/quality/60/format/jpg","name":"开眼创意精选","description":"技术与审美结合，探索视觉的无限可能","link":"","latestReleaseTime":1542643262000,"videoNum":586,"adTrack":null,"follow":{"itemType":"author","itemId":2161,"followed":false},"shield":{"itemType":"author","itemId":2161,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/19f5fbf2dd29231ad8e717d267923256.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/19f5fbf2dd29231ad8e717d267923256.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/482b60b9b2066aecc7f4119165096bd5.png?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/19f5fbf2dd29231ad8e717d267923256.png?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137713&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":129,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=137713","forWeibo":"http://www.eyepetizer.net/detail.html?vid=137713"},"releaseTime":1542643262000,"playInfo":[],"campaign":null,"waterMarks":null,"ad":false,"adTrack":null,"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":null,"ifLimitVideo":false,"searchWeight":0,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1542848400000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"觉得生活无趣？那可能是你的打开方式不对。来自俄罗斯的创作者 Tomin 用创意和技术让日常生活里平白无奇的物体瞬间生动起来。其实生活处处有惊喜，重要的是换个角度换个心情。From Tomin","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":137323,"title":"清醒点吧，有一种错觉叫自以为是","description":"你善于赚钱吗？工作能力强吗？心理学研究表明，我们并不擅长准确地评估自己。事实上，我们经常高估自己的能力。","library":"DAILY","tags":[{"id":44,"name":"科普","actionUrl":"eyepetizer://tag/44/?title=%E7%A7%91%E6%99%AE","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f2e7359e81e217782f32cc3d482b3284.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/f2e7359e81e217782f32cc3d482b3284.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":864,"name":"人文社科","actionUrl":"eyepetizer://tag/864/?title=%E4%BA%BA%E6%96%87%E7%A4%BE%E7%A7%91","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/5a24f441d4842d417b67470d71b01fb7.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/5a24f441d4842d417b67470d71b01fb7.png?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":556,"name":"科技","actionUrl":"eyepetizer://tag/556/?title=%E7%A7%91%E6%8A%80","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/27c3e861a02ced6069dd64c977746a61.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/b8a3443f9ff392b22201b74e47995e3c.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0}],"consumption":{"collectionCount":717,"shareCount":288,"replyCount":9},"resourceType":"video","slogan":"别那么骄傲，其实你没那么厉害","provider":{"name":"定制来源","alias":"CustomSrc","icon":""},"category":"科技","author":{"id":2398,"icon":"http://img.kaiyanapp.com/5e4a548d975069f7d7d1b1fe22286b3e.jpeg?imageMogr2/quality/60/format/jpg","name":"TED-Ed","description":"TED-Ed 致力于与更多的动画师和教育学者共同创造出更多优秀的科普视频。","link":"","latestReleaseTime":1542816066000,"videoNum":270,"adTrack":null,"follow":{"itemType":"author","itemId":2398,"followed":false},"shield":{"itemType":"author","itemId":2398,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/e949abd0519390415677911301e5d730.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/e949abd0519390415677911301e5d730.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/81279a1cda89508240859af9ae895f45.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/e949abd0519390415677911301e5d730.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137323&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":307,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=137323","forWeibo":"http://www.eyepetizer.net/detail.html?vid=137323&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1542297605000,"playInfo":[{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137323&resourceType=video&editionType=high&source=aliyun","size":30518083},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137323&resourceType=video&editionType=high&source=qcloud","size":30518083},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137323&resourceType=video&editionType=high&source=ucloud","size":30518083}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=137323&resourceType=video&editionType=high&source=aliyun"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":null,"type":"NORMAL","titlePgc":"","descriptionPgc":"","remark":null,"ifLimitVideo":false,"searchWeight":0,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1542848400000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"你善于赚钱吗？工作能力强吗？心理学研究表明，我们并不擅长准确地评估自己。事实上，我们经常高估自己的能力。","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1},{"type":"video","data":{"dataType":"VideoBeanForClient","id":138012,"title":"史上第一团！5 个男女水下弹唱，全球爆红","description":"在水下一边憋气，一边弹琴唱歌，是怎样的体验？5 个来自丹麦的音乐家，花了十年时间，找到了在水中演奏的方法，组成了世界第一支水下乐队！他们沉入大水缸，唱歌、拉小提琴、打鼓、弹六弦琴\u2026\u2026创造出极为空灵、人们从未听过的音乐。","library":"DAILY","tags":[{"id":743,"name":"记录精选","actionUrl":"eyepetizer://tag/743/?title=%E8%AE%B0%E5%BD%95%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":700,"name":"音乐人","actionUrl":"eyepetizer://tag/700/?title=%E9%9F%B3%E4%B9%90%E4%BA%BA","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/f33fd7ec570017c58f9daa43e9d17f36.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/f33fd7ec570017c58f9daa43e9d17f36.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0},{"id":24,"name":"记录","actionUrl":"eyepetizer://tag/24/?title=%E8%AE%B0%E5%BD%95","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/c3984cad49455e01637347e0c8f6a37d.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/fd76dab1411e07f0dcf45309720134f9.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"communityIndex":0}],"consumption":{"collectionCount":145,"shareCount":69,"replyCount":4},"resourceType":"video","slogan":"一边憋气一边弹琴唱歌会怎样？","provider":{"name":"PGC","alias":"PGC","icon":""},"category":"记录","author":{"id":170,"icon":"http://img.kaiyanapp.com/b1f252f2a97e014f6de7e65709c5eedd.png?imageMogr2/quality/60/format/jpg","name":"一条","description":"所有未在美中度过的生活，都是被浪费了。","link":"","latestReleaseTime":1542797376000,"videoNum":1299,"adTrack":null,"follow":{"itemType":"author","itemId":170,"followed":false},"shield":{"itemType":"author","itemId":170,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true},"cover":{"feed":"http://img.kaiyanapp.com/e03c16c9d3255b9e54b018e3160bb433.png?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/e03c16c9d3255b9e54b018e3160bb433.png?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/ae68c1b5a636149bdcf63e1b2418a8b9.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=138012&resourceType=video&editionType=default&source=aliyun","thumbPlayUrl":null,"duration":257,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=138012","forWeibo":"http://www.eyepetizer.net/detail.html?vid=138012&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1542548055000,"playInfo":[],"campaign":null,"waterMarks":null,"ad":false,"adTrack":null,"type":"NORMAL","titlePgc":"史上第一团！5个男女水下弹唱，全球爆红","descriptionPgc":"在水下一边憋气，一边弹琴唱歌，是怎样的体验？5个来自丹麦的音乐家，花了十年时间，找到了在水中演奏的方法，组成了世界第一支水下乐队！他们沉入大水缸，唱歌、拉小提琴、打鼓、弹六弦琴\u2026\u2026创造出极为空灵、人们从未听过的音乐。","remark":"","ifLimitVideo":false,"searchWeight":0,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1542848400000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"在水下一边憋气，一边弹琴唱歌，是怎样的体验？5 个来自丹麦的音乐家，花了十年时间，找到了在水中演奏的方法，组成了世界第一支水下乐队！他们沉入大水缸，唱歌、拉小提琴、打鼓、弹六弦琴\u2026\u2026创造出极为空灵、人们从未听过的音乐。","collected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1}]
         * count : 5
         */

        private long releaseTime;
        private String type;
        private long date;
        private long publishTime;
        private int count;
        private List<ItemListBean> itemList;

        public long getReleaseTime() {
            return releaseTime;
        }

        public void setReleaseTime(long releaseTime) {
            this.releaseTime = releaseTime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public long getDate() {
            return date;
        }

        public void setDate(long date) {
            this.date = date;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<ItemListBean> getItemList() {
            return itemList;
        }

        public void setItemList(List<ItemListBean> itemList) {
            this.itemList = itemList;
        }

        public static class ItemListBean {
            /**
             * type : banner2
             * data : {"dataType":"Banner","id":0,"title":"","description":"","image":"http://img.kaiyanapp.com/eef24aa10ab6cf17b5a512943ec22053.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"","adTrack":null,"shade":false,"label":null,"labelList":null,"header":null,"autoPlay":false}
             * tag : null
             * id : 0
             * adIndex : -1
             */

            private String type;
            private DataBean data;
            private Object tag;
            private int id;
            private int adIndex;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public DataBean getData() {
                return data;
            }

            public void setData(DataBean data) {
                this.data = data;
            }

            public Object getTag() {
                return tag;
            }

            public void setTag(Object tag) {
                this.tag = tag;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getAdIndex() {
                return adIndex;
            }

            public void setAdIndex(int adIndex) {
                this.adIndex = adIndex;
            }

            public static class DataBean {
                /**
                 * dataType : Banner
                 * id : 0
                 * title :
                 * description :
                 * image : http://img.kaiyanapp.com/eef24aa10ab6cf17b5a512943ec22053.jpeg?imageMogr2/quality/60/format/jpg
                 * actionUrl :
                 * adTrack : null
                 * shade : false
                 * label : null
                 * labelList : null
                 * header : null
                 * autoPlay : false
                 */

                private String dataType;
                private int id;
                private String title;
                private String description;
                private String image;
                private String actionUrl;
                private Object adTrack;
                private boolean shade;
                private Object label;
                private Object labelList;
                private Object header;
                private boolean autoPlay;

                public String getDataType() {
                    return dataType;
                }

                public void setDataType(String dataType) {
                    this.dataType = dataType;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public boolean isShade() {
                    return shade;
                }

                public void setShade(boolean shade) {
                    this.shade = shade;
                }

                public Object getLabel() {
                    return label;
                }

                public void setLabel(Object label) {
                    this.label = label;
                }

                public Object getLabelList() {
                    return labelList;
                }

                public void setLabelList(Object labelList) {
                    this.labelList = labelList;
                }

                public Object getHeader() {
                    return header;
                }

                public void setHeader(Object header) {
                    this.header = header;
                }

                public boolean isAutoPlay() {
                    return autoPlay;
                }

                public void setAutoPlay(boolean autoPlay) {
                    this.autoPlay = autoPlay;
                }
            }
        }
    }
}

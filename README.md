# myblog
基于SSM的个人博客。

## 开发日志
##### 2018年5月5日
- 创建骨架，添加git，添加.gitignore文件。复制前端文件到项目中。加深学习CSS3各种选择器。
- 需求分析，查找一般个人博客网站数据表的设计并结合自己博客功能和扩展，编写mybolg.sql脚本文件，设计部分数据表。article、user、type
表，还有其他表暂时未设计。包括评论表，广告表，友链表等。
- 学习mysql数据类型，int(M)中M的含义，varchar(M)中M是指字符还是字节数（5.X的版本是指字符数即可以存放M个英文字符或者汉子字符，都是M个）。
datetime和time的区别，字面含义，**日期+时间**和**仅时间**的区别。
- 直接使用blob存储图片，还是存储图片路径，然后上传图片到服务器。选后者，前者影响性能。
##### 5月6日
- 编写Article实体类，对应数据表的属性，java.util.Date与MySQL中DateTime对应。编写ArticleDao类，
设计了基本的几个CRUD方法。编写ArticleMapper.xml文件，映射各个SQL语句。
- 添加spring、mybatis、MVC和web.xml配置文件。编写Junit4测试ArticleDAO中的方法。
- 测试遇到问题：拼写错误，SQL语句末尾分号和逗号错误，parameterType，resultType和resultMap不对等等。
- update标签<if test="">中的应该是java对象的属性而不是写MySQL中列的值。

##### 5月7日
- 考虑动态显示文章技术是使用传统的JSP技术还是最近流行的Ajax+HTML。
- 个人对jsp比较熟悉而对ajax不太熟，但是ajax入门还是比较简单的。
- jsp对后期维护更新项目不友好，更换后端技术什么的；ajax可以做到前后端分离，适合后期大项目。本项目为小项目。
- jsp可以被搜索引擎搜索到，ajax则不行。本项目为博客，倾向使用jsp。
- 另外采用ajax+HTML需要维护大量的css和js代码，对后端人员相当不友好。
- 看到有项目中在service层中引入request和response参数，查看资料说这样不好，不符合分层的规范，后面也不
方便做测试，当然小项目可以这样，大项目不推荐。
- 项目中有需要根据文章类别查询的需求，为了加快查询速度，在typeId上增加索引。但是实际上typeId是另一个表type
的主键，但是没有建立**显式**的外键。所以不清楚是否需要显示建立索引。继续搜。。（先暂时增加吧）
- 关于数据库外键的一些说明：数据库的诸多设计，帐号，权限，约束，触发器，都是为C/S结构设计的，是以
C端不可信做为假设前提的。B/S模式安全边界前移到web服务层，应用与数据库之间是可信的，应用自行完成
这些功能更加灵活。(来自知乎，个人感觉有道理)
- 懒加载+滚动加载还是分页显示，前者不太懂，好像使用js实现；还是使用分页吧。
- 分页在service层还是controller层。分页属于业务逻辑，还是在service层中写，controller只用来负责
转发。使用分页插件pageHelper在service层进行分页。

##### 5月8日
- 出现了访问controller报404错误，查找原因，暂时未找到原因。
- 尝试了各种原因终于找到了原因。web-xml<web-app>标签头中metadata-complete属性去掉，因为复制的一个模板项目。
该属性可能与rest风格有关。

##### 5月9日
- 分别将分页后的articleList和分页信息page放入到Model中。
- 使用pageInfo会出现第0页的情况，看起来很不爽。设置reasonable属性为false还是存在page=0，
只是不显示结果集。

##### 6月10日

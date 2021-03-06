<div id="table-of-contents">
<h2>Table of Contents</h2>
<div id="text-table-of-contents">
<ul>
<li><a href="#orge21e2c7">1. hrframework使用方法</a></li>
</ul>
</div>
</div>

<a id="orge21e2c7"></a>

# hrframework使用方法

1.  目录结构说明

backend:java后台代码gradle项目位置
web:前端glup项目位置
wiki:相关功能说明文档
.gitighore:版本控制屏蔽文件
README:说明文档

1.  如何正确打开
    1.  打开前端项目
        1.  使用任何一款开发工具打开web文件夹
    2.  打开后端项目
        1.  使用任何一款java开发工具打开backend文件夹。
        2.  如果工具未能识别gradle项目，用适合的方式导入gradle项目
    3.  运行后端项目
        1.  根据使用java开发工具的要求启动web项目即可。
        2.  如果希望在命令行内执行。
            1.  确认正确安装gradle。
            2.  确认正确安装JDK。
            3.  cd 到 backend 文件夹内
            4.  执行 gradle appRun 命令
    4.  运行前端项目
        1.  在web文件夹内打开命令行工具 或 cd 到web文件夹内
        2.  执行  gulp  命令
        3.  如果提示安装gulp 自行百度安装gulp。
        4.  如果提示找不到库，执行 npm install 安装。

2.  开发阶段使用方式
    1.  开发流程
        1.  使用hrframe自带yaml文档，或自定义（需要自定义hrframe函数）编写接口测试文档
        2.  根据接口文档开发前端界面
        3.  测试前端界面效果
        4.  根据接口测试后端功能
        5.  测试后端功能
    
    2.  连接本地java or 连接远程java
        1.  两种配置方式，根据自身灵活选择
            1.  使用web/app/server.js 文件来配置远程地址
            2.  使用gulpfile配置远程地址

1.  实施阶段注意事项
    1.  整体部署方案为 Nginx 反响代理多个 war 项目。
    2.  建议将静态文件部署到nginx提高性能。
    3.  可以使用多个war进行负载均衡。
    4.  如果有条件，可选择Docker部署，增加灵活性。
    5.  由于开发过程中不同的plugin访问后台同名的代码，因此部署的时候要对每一个plugin访问的后台地址进行统一修改。或在项目开始阶段进行约定。（hrframework在这个问题上并没有统一处理）


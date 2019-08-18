<h1 align="center"><font face="STCAIYUN">Easy-yapi</font></h1>
<p align="center">
    <a href="https://plugins.jetbrains.com/plugin/12458-easyyapi" target="_blank">
        <img src="https://img.shields.io/jetbrains/plugin/v/12458?color=blue&label=version" width=""/>
    </a>
    <a href="https://plugins.jetbrains.com/plugin/12458-easyyapi" target="_blank">
        <img src="https://img.shields.io/jetbrains/plugin/d/12458" width=""/>
    </a>
</p>

## 简介
- [yapi](https://github.com/YMFE/yapi)定制版[easy-api](https://github.com/tangcent/easy-api)

- [中文](https://github.com/tangcent/easy-yapi/blob/master/README_cn.md) | [English](https://github.com/tangcent/easy-yapi/blob/master/README.md)

- [demo](https://github.com/tangcent/spring-demo)

- 在[easy-api](https://github.com/tangcent/easy-api)的基础上增加对yapi的支持。
如果你对easy-api有兴趣或者希望支持其他第三方API管理平台,那么这也是一个很好的例子，通过对比[easy-api](https://github.com/tangcent/easy-api)与[easy-yapi](https://github.com/tangcent/easy-yapi)的差异，可以了解到如何在[easy-api](https://github.com/tangcent/easy-api)的基础上开发，使其得以支持第三方API管理平台。

## Javadoc

- [wiki](https://en.wikipedia.org/wiki/Javadoc)
- [oracle](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html)
- [baike](https://baike.baidu.com/item/javadoc)

# 目录
 - [提示](#提示)
 - [版本](#版本)
 - [安装方法](#安装方法)
    - <a href = '#span3'>IDEA中安装</a>
    - <a href = '#span4'>手动安装</a>
 - [参数配置](#参数配置)
    - <a href = '#span1'>yapi相关参数配置</a>
    - <a href = '#span2'>个性化配置</a>
 - [使用方法](#使用方法)
 - [特征](#特征)

## 提示
在`1.0.0`版本发布之前，[easy-yapi](https://github.com/tangcent/easy-yapi)将快速迭代。
如果遇到失败的情况：
1.请提出问题。
2.尝试回滚到以前的版本。
3.随时发送电子邮件给[我](mailto:pentatangcent@gmail.com)。

## 版本

`$major.$minor.$min_support.$max_support.$fix`

## 安装方法

**支持以下IDE version > 173(2017.3)**

- IntelliJ IDEA
- IntelliJ IDEA Community Edition

#### <span id = 'span3' style="color: #6495ED"> > IDEA中安装:</span>
- <kbd>Preferences(Settings)</kbd> > <kbd>Plugins</kbd> > <kbd>Browse repositories...</kbd> > <kbd>find"EasyYapi"</kbd> > <kbd>Install Plugin</kbd>

#### <span id = 'span4' style="color: #6495ED"> > 手动安装:</span>
- download from [Jetbrains](https://plugins.jetbrains.com/plugin/12458-easyyapi) or [Github](https://github.com/tangcent/easy-yapi-plugins/raw/master/idea/easy-yapi.jar) -> <kbd>Preferences(Settings)</kbd> > <kbd>Plugins</kbd> > <kbd>Install plugin from disk...</kbd>

安装完成后重启 **IDE**.

## 参数配置

#### <span id='span1' style="color: #6495ED">yapi相关参数配置</span>

- 在导出过程中如果需要yapi相关参数，将会以弹窗的方式提供输入。
- 也可以在 <kbd>Preferences(Settings)</kbd> >  <kbd>Other Settings</kbd> > <kbd>EasyApi</kbd> 中手动配置.首次使用此插件时，建议开启<font style="color: red">inferEnable</font>，这将允许插件在遇到不确定的方法返回类型<font style="color: red">(Object,Some\<Object>)</font>时尝试通过代码流进行推断,并根据项目需求设置<font style="color: red">maxDeep</font>(最大推断深度)。
- 需要提供的参数有
    - `server`：即部署的yapi地址，如:http://127.0.0.1:3000/
    - `tokens`：即yapi项目中用于请求项目openapi的私有token，获取方式为 <kbd>项目</kbd>><kbd>设置</kbd>><kbd>token 配置</kbd> > <kbd>工具标识</kbd>
#### <span id='span2' style="color: #6495ED">个性化配置</font>
 因为现在插件众多，快捷键被占用的情况时有发生，另则开发者们习惯的快捷键方式各不相同，故而easy-yapi基本上不设置默认快捷键， 如需快捷键，可自行在IDE中设置.
 - ##### [支持额外配置](https://github.com/tangcent/easy-yapi/wiki/1.-%E6%94%AF%E6%8C%81%E9%A2%9D%E5%A4%96%E9%85%8D%E7%BD%AE)
    - 将配置文件添加到项目根目录中
    - <font style="color: red; background:yellow">[.easy.api.config]</font> 对所有操作有效
    - <font style="color: red; background:yellow">[.postman.config]</font> 对Postman相关操作有效
    - <font style="color: red; background:yellow">[.yapi.config]</font> 对Yapi相关操作有效
- ##### [支持的配置规则](https://github.com/tangcent/easy-yapi/wiki/2.-%E6%94%AF%E6%8C%81%E7%9A%84%E9%85%8D%E7%BD%AE%E8%A7%84%E5%88%99)
    - 支持的规则

        | 规则的key |规则目标(上下文)| 版本  | 规则描述 |
        | :-------------: |:-------------:| :-----:| :------:|
        |  module|	class|	v0.7.2+	|为api分组|
        |ignore|	class/method	|v0.7.2+	|忽略API|
        | json.rule.field.name |	field|	v0.7.2+|	设置输出的字段名(用于json中字段名与类中字段名不一致)|
        |json.rule.field.ignore|	field|	v0.7.2+	|忽略字段(设置某些字段不出现在json中,或不需要请求时给出)|
        |json.rule.convert|	-|	v0.7.2+	|用于设置某些类型转换为其他类型处理，通常用于使用了Spring的自定义类型转换器的情况|
        |doc.field|	field|v0.7.2+|	字段的额外注释|
        |doc.method|	method|	v0.7.2+|	方法(api)的额外注释|
        |param.required|	arg|	v0.7.3+	|API参数是否为必须(不可为空)|
        |field.required	|field|	v0.7.3+	|字段是否为必须(不可为空)|
        |api.tag|	method|	v0.7.5+|	标记接口tag|
        |api.status	|method|	v0.8.0+	|标记接口status(应返回done/undone)|
    - 简单规则
        -  <font style="color: red; background:yellow"># </font>读取注释上的tag
        -  <font style="color: red; background:yellow">@ </font>读取注解
        -  <font style="color: red; background:yellow">@xxx </font>读取方法或字段上的注解
        -  <font style="color: red; background:yellow">@xxx#yyy </font>读取方法或字段上的注解中的`attr`值
    - 高级脚本规则(beta)
        - 由于JDK11后js引擎可能缺失，故推荐使用[groovy](https://baike.baidu.com/item/Groovy/180590)作为首选
        - [groovy](https://baike.baidu.com/item/Groovy/180590)规则为 `groovy:groovyScript`
        - js规则为 `js:jsScript`
        - 脚本中默认注入[it]表示当前规则的应用对象,应用对象只提供方法即<font style="color: red; background:yellow">[it.method()✅]</font>，不提供属性<font style="color: red; background:yellow">[it.property❎]</font>
        - 对于class(类)、method(方法/API)、field(字段/属性),arg(参数)都支持如下方法:
            | 方法 | 返回值 | 描述 | 例子 |
            | :-------------: | :-------------: | :-----: | :------ |  
            | hasAnn("annotation_name") | name() | String | 名称 | it.name() |
            |ann("annotation_name") | boolean|	是否有指定注解|	it.hasAnn("org.springframework.web.bind.annotation.RequestBody")|
            |ann("annotation_name")	|String	|获取指定注解值(默认value)|	it.ann("org.springframework.web.bind.annotation.RequestBody")
            ann("annotation_name","attr")	|String|	获取指定注解中的指定参数值|	it.ann("org.springframework.web.bind.annotation.RequestMapping","path")
            doc()|	String|	获取注释值|	it.doc()
            doc("tag")	|String|	获取注释tag值(不需要加@)|	it.doc("return")
            doc("tag","subTag")|	String	|获取二级注释tag值	| it.doc("param","a")
            hasDoc("tag")	|String	|是否有指定注释tag|	it.hasDoc("ignore")|
    - 不同的应用对象提供额外的方法
        - class(类)
           | 方法 | 返回值 | 描述 | 例子 |
            | :-------------: | :-------------: | :-----: | :------: |  
            |methods()|	method[]|	类中的所有方法|	it.methods()|
            |methodCnt()	|int|	类中的方法数|	it.methodCnt()|
            |field()	|int	|类中的所有字段|	it.field()|
           | fieldCnt()|	int	|类中的字段数|	it.fieldCnt()|
            |isExtend()|	boolean|	是否继承某个类|	it.isExtend()|
            |isMap()	|boolean	|是否为Map	|it.isMap()|
            |isCollection()	|boolean	|是否为集合|	it.isCollection()|
            |isArray()	|boolean|	是否为数组|	it.isArray()|
        - method(方法/API)
           | 方法 | 返回值 | 描述 | 例子 |
           | :-------------: | :-------------: | :-----: | :------: |  
            |returnType()|	class	|方法返回类型	|it.returnType()|
            | isVarArgs()	|boolean	|是否有不定参	|it.isVarArgs()|
            |args()|	arg[]	|方法的所有参数	|it.args()|
            |argTypes()	|class[]	|方法的所有参数类型	|it.argTypes()|
            |argCnt()	|int|	方法参数个数|	it.argCnt()|
            |containingClass()|	class	|方法所属类	|it.containingClass()|
        - field(字段/属性)
            | 方法 | 返回值 | 描述 | 例子 |
            | :-------------: | :-------------: | :-----: | :------: |  
            | type()	|class|	字段类型|	it.type()|
            |containingClass()|	class	|方法所属类|	it.containingClass()|
            |jsonName()	|class|	字段json名|	it.jsonName()|
        - arg(参数)
            | 方法 | 返回值 | 描述 | 例子 |
            | :-------------: | :-------------: | :-----: | :------: |  
            |type()|	class|	参数类型|	it.type()|
            |isVarArgs()|	boolean	|是否为不定参|	it.isVarArgs()|
- ##### [yapi mock配置](https://github.com/tangcent/easy-yapi/wiki/3.-yapi-mock%E9%85%8D%E7%BD%AE)
    - 可使用两种配置文件
        - <font style="color: red; background:yellow">[.yapi.config]</font>仅对导出到yapi有效
        - <font style="color: red; background:yellow">[.easy.api.config]\(推荐)</font>对所有API导出操作有效
    - 可增加自定义`mock`规则(beta)
        <details>     
            <summary style = "color:red;font-size:18px">点击查看示例</summary>   
                <blockcode>

            ## 增加自定义mock规则
            #mockjs官方示例: http://mockjs.com/examples.html
            #定义一些基础的规则
            #中国手机号
            phone=1@pick(["34","35","36","37","38","39","50","5","52","58","59","57","82","87","88","70","47","30","3","32","55","56","85","86","33","53","80","89"])@string("number", 8)
            #毫秒时间戳
            mtimestamp=@timestamp@string("number", 3)
            #0-9
            digit=@natural(0,9)
            #小于1000的自然数
            natural_lt_1000=@natural(0,1000)
            #小数点后两位
            float_with_two=@natural(0,10000).@natural(0,100)
            #http url
            http_url=@pick(["http","https"])://www.@domain()/@string('lower',1,8)?@string('lower',2,4)=@string('number',1,2)
            #objectId 只是字符和位数，不满足具体协议
            objectId=@string("0123456789abcdef",24,24) 
        </details>

    - 可以使用`mockjs`提供的规则与自定义的规则来定制最后输出到`YAPI`的`mock`信息
        <details>     
            <summary style = "color:red;font-size:18px">点击查看示例</summary>   
                <blockcode>
        
            #常见的响应mock
            mock.[c|integer]=0
            mock.[code|integer]=0
            mock.[status|integer]=0
            mock.[ok|boolean]=true
            mock.[success|boolean]=true
            mock.[m|string]=
            mock.[msg|string]=
            mock.[message|string]=
            mock.[errMsg|string]=
            #常见的分页mock
            mock.[*.p|integer]=1
            mock.[*.l|integer]=@pick(["10","15","100"])
            mock.[*.t|integer]=@natural(0,1000)
            mock.[*.offset|integer]=1
            mock.[*.limit|integer]=@pick(["10","15","100"])
            mock.[*.total|integer]=@natural(0,1000)

            # 整型的xxxTime mock为时间戳
            mock.[*Time|integer]=${mtimestamp}

            #性别
            mock.[*.sex|integer]=@natural(0,2)
            mock.[*.sex|string]=@pick(["男","女"])
            mock.[*.gender|integer]=@natural(0,2)
            mock.[*.gender|string]=@pick(["男","女"])

            //用户信息相关
            mock.[*.phone|string]=${phone}
            mock.[*Phone|string]=${phone}
            mock.[*.provinceName|string]=@province
            mock.[*ProvinceName|string]=@province
            mock.[*.cityName|string]=@city
            mock.[*CityName|string]=@city
            mock.[*.districtName|string]=@county
            mock.[*DistrictName|string]=@county
            mock.[*.address]=@cword(2,3)路@natural(1,1500)号

            #链接
            mock.[*.url|string]=${http_url}
            mock.[*.link|string]=${http_url}
            mock.[*.linkUrl|string]=${http_url}
            mock.[*Link|string]=${http_url}

            # integer和number更自然一些
            mock.[*Type|integer]=${digit}
            mock.[*Status|integer]=${digit}
            mock.[*.type|integer]=${digit}
            mock.[*.status|integer]=${digit}
            mock.[*|integer]=@natural(0,10000)
            mock.[*|number]=@float(0,10000)
        </details>
- ##### [配置demo](https://github.com/tangcent/easy-yapi/wiki/4.-%E9%85%8D%E7%BD%AEdemo)
    <details>     
    <summary style = "color:red;font-size:18px">点击查看示例</summary>   
        <blockcode>
         
        #yapi mock规则---------------------------------------
        #mockjs官方示例: http://mockjs.com/examples.html
        #定义一些基础的规则
        #手机号
        phone=1@pick(["34","35","36","37","38","39","50","5","52","58","59","57","82","87","88","70","47","30","3","32","55","56","85","86","33","53","80","89"])@string("number", 8)
        #毫秒时间戳
        mtimestamp=@timestamp@string("number", 3)
        #0-9
        digit=@natural(0,9)
        #小于1000的自然数
        natural_lt_1000=@natural(0,1000)
        #小数点后两位
        float_with_two=@natural(0,10000).@natural(0,100)
        #mj-img
        img=@string("0123456789abcdef",32,32).@pick(["gif","bmp","jpg","jpeg","png"])
        #http url
        http_url=@pick(["http","https"])://www.@domain()/@string('lower',1,8)?@string('lower',2,4)=@string('number',1,2)
        #objectId 只是字符和位数，不满足具体协议
        objectId=@string("0123456789abcdef",24,24)
        #常见的响应mock
        mock.[c|integer]=0
        mock.[code|integer]=0
        mock.[status|integer]=0
        mock.[ok|boolean]=true
        mock.[success|boolean]=true
        mock.[m|string]=
        mock.[msg|string]=
        mock.[message|string]=
        mock.[errMsg|string]=

        #常见的分页mock
        mock.[*.p|integer]=1
        mock.[*.l|integer]=@pick(["10","15","100"])
        mock.[*.t|integer]=@natural(0,1000)
        mock.[*.offset|integer]=1
        mock.[*.limit|integer]=@pick(["10","15","100"])
        mock.[*.total|integer]=@natural(0,1000)

        # 整型的xxxTime mock为时间戳
        mock.[*Time|integer]=${mtimestamp}

        #性别
        mock.[*.sex|integer]=@natural(0,2)
        mock.[*.sex|string]=@pick(["男","女"])

        //用户信息相关
        mock.[*.phone|string]=${phone}
        mock.[*Phone|string]=${phone}
        mock.[*.provinceName|string]=@province
        mock.[*ProvinceName|string]=@province
        mock.[*.cityName|string]=@city
        mock.[*CityName|string]=@city
        mock.[*.districtName|string]=@county
        mock.[*DistrictName|string]=@county
        mock.[*.address]=@cword(2,3)路@natural(1,1500)号

        #链接
        mock.[*.url|string]=${http_url}
        mock.[*.link|string]=${http_url}
        mock.[*.linkUrl|string]=${http_url}
        mock.[*Link|string]=${http_url}

        # integer和number更自然一些
        mock.[*Type|integer]=${digit}
        mock.[*Status|integer]=${digit}
        mock.[*.type|integer]=${digit}
        mock.[*.status|integer]=${digit}
        mock.[*|integer]=@natural(0,10000)
        mock.[*|number]=@float(0,10000)

        # @表示注解 #表示注释tag

        #从注释上获取module，即要导入到yapi的哪个项目
        module=#module

        #忽略不解析
        ignore=#ignore

        #额外的json解析规则
        #支持jackson注解
        json.rule.field.name=@com.fasterxml.jackson.annotation.JsonProperty#value
        #ObjectId和Date处理为String
        json.rule.convert[org.bson.types.ObjectId]=java.lang.String
        json.rule.convert[java.util.Date]=java.lang.String
    </details>

- [支持本地groovy扩展](https://github.com/tangcent/easy-yapi/wiki/5.-%E6%94%AF%E6%8C%81%E6%9C%AC%E5%9C%B0groovy%E6%89%A9%E5%B1%95)
    <strong>
        <font style="color:red; background:yellow" size='4'>注意:本地groovy扩展需要对groovy以及当前插件的结构有一定的了解</font>
    </strong>
    - Add groovy file at `$project/.easyapi/ext`
    - Named `${ActionName}Ext.groovy`
    - Supported actions:
        - ApiCallAction
        - ApiDashBoardAction
        - FieldsToJsonAction
        - MarkdownExportAction
        - PostmanExportAction
    - Inject custom class by binder in `init` method
    demo: https://github.com/tangcent/spring-demo/blob/master/.easyapi/ext/MarkdownExportActionExt.groovy
        <details>     
            <summary style = "color:red;font-size:18px">点击查看demo</summary>   
            <blockcode>
            
                import com.intellij.psi.*
                import com.intellij.psi.PsiModifierListOwner
                import com.intellij.psi.util.PsiTypesUtil
                import com.itangcent.common.constant.HttpMethod
                import com.itangcent.common.exporter.ClassExporter
                import com.itangcent.common.exporter.RequestHelper
                import com.itangcent.common.exporter.RequestHelperKt
                import com.itangcent.common.model.Header
                import com.itangcent.common.model.Request
                import com.itangcent.idea.plugin.api.export.AbstractClassExporter
                import com.itangcent.idea.plugin.api.export.ClassExportRuleKeys
                import com.itangcent.idea.plugin.script.ActionExt
                import com.itangcent.idea.plugin.utils.KtHelper
                import com.itangcent.idea.plugin.utils.SpringClassName
                import com.itangcent.intellij.context.ActionContext
                import com.itangcent.intellij.psi.ClassRuleKeys
                import com.itangcent.intellij.psi.PsiAnnotationUtils
                import com.itangcent.intellij.util.KV
                import org.apache.commons.lang3.StringUtils

                class MarkdownExportActionExt implements ActionExt {

                void init(ActionContext.ActionContextBuilder builder) {

                    builder.bindInstance("file.save.default", "custom.ext.easy-api.md")                                 \

                    builder.bind(ClassExporter.class, KtHelper.INSTANCE.ktFunction({
                        it.to(CustomClassExporter.class).in(com.google.inject.Singleton.class)
                        return null
                    }))
                }

                static class CustomClassExporter extends AbstractClassExporter {

                    void processClass(PsiClass cls, KV<String, Object> kv) {
                        logger.info("process class by ext:" + cls.name)

                        PsiAnnotation ctrlRequestMappingAnn = findRequestMapping(cls)
                        String basePath = findHttpPath(ctrlRequestMappingAnn) ?: ""

                        String ctrlHttpMethod = findHttpMethod(ctrlRequestMappingAnn)

                        kv.put("basePath", basePath)
                        kv.put("ctrlHttpMethod", ctrlHttpMethod)
                    }

                    protected boolean hasApi(PsiClass psiClass) {
                        return psiClass.annotations.any {
                            SpringClassName.SPRING_CONTROLLER_ANNOTATION.contains(it.qualifiedName)
                        }
                    }

                    boolean isApi(PsiMethod psiMethod) {
                        return findRequestMappingInAnn(psiMethod) != null
                    }

                    void processMethodParameter(PsiMethod method, Request request, PsiParameter param, String paramDesc, RequestHelper requestHelper) {

                        PsiAnnotation requestBodyAnn = findRequestBody(param)
                        if (requestBodyAnn != null) {
                            if (request.method == HttpMethod.NO_METHOD) {
                                requestHelper.setMethod(request, HttpMethod.POST)
                            }
                            RequestHelperKt.addHeader(requestHelper, request, "Content-Type", "application/json")
                            requestHelper.setJsonBody(
                                    request,
                                    parseRequestBody(param.type, method),
                                    paramDesc
                            )
                            return
                        }

                        PsiAnnotation modelAttrAnn = findModelAttr(param)
                        if (modelAttrAnn != null) {
                            if (request.method == HttpMethod.GET) {
                                addParamAsQuery(param, request, requestHelper)
                            } else {
                                if (request.method == HttpMethod.NO_METHOD) {
                                    requestHelper.setMethod(request, HttpMethod.POST)
                                }
                                addParamAsForm(param, request, requestHelper, null)
                            }
                            return
                        }

                        PsiAnnotation requestHeaderAnn = findRequestHeader(param)
                        if (requestHeaderAnn != null) {

                            String headName = PsiAnnotationUtils.INSTANCE.findAttr(requestHeaderAnn,
                                    "value")
                            if (StringUtils.isBlank(headName)) {
                                headName = PsiAnnotationUtils.INSTANCE.findAttr(requestHeaderAnn,
                                        "name")
                            }
                            if (StringUtils.isBlank(headName)) {
                                headName = param.name
                            }

                            boolean required = findParamRequired(requestHeaderAnn) ?: true
                            if (!required && ruleComputer.computer(ClassExportRuleKeys.INSTANCE.PARAM_REQUIRED, param) == true) {
                                required = true
                            }

                            String defaultValue = PsiAnnotationUtils.INSTANCE.findAttr(requestHeaderAnn,
                                    "defaultValue")

                            if (defaultValue == null
                                    || defaultValue == SpringClassName.ESCAPE_REQUEST_HEADER_DEFAULT_NONE
                                    || defaultValue == SpringClassName.REQUEST_HEADER_DEFAULT_NONE) {
                                defaultValue = ""
                            }

                            Header header = new Header()
                            header.name = headName
                            header.value = defaultValue
                            header.example = defaultValue
                            header.desc = paramDesc
                            header.required = required
                            requestHelper.addHeader(request, header)
                            return
                        }

                        PsiAnnotation pathVariableAnn = findPathVariable(param)
                        if (pathVariableAnn != null) {

                            String pathName = PsiAnnotationUtils.INSTANCE.findAttr(pathVariableAnn,
                                    "value")
                            if (pathName == null) {
                                pathName = param.name
                            }

                            RequestHelperKt.addPathParam(requestHelper, request, pathName, paramDesc ?: "")
                            return
                        }

                        String paramName = null
                        Boolean required = false
                        Object defaultVal = null

                        PsiAnnotation requestParamAnn = findRequestParam(param)

                        if (requestParamAnn != null) {
                            paramName = findParamName(requestParamAnn)
                            required = findParamRequired(requestParamAnn) ?: true

                            defaultVal = PsiAnnotationUtils.INSTANCE.findAttr(requestParamAnn,
                                    "defaultValue")

                            if (defaultVal == null
                                    || defaultVal == SpringClassName.ESCAPE_REQUEST_HEADER_DEFAULT_NONE
                                    || defaultVal == SpringClassName.REQUEST_HEADER_DEFAULT_NONE) {
                                defaultVal = ""
                            }
                        }

                        if (!required && ruleComputer.computer(ClassExportRuleKeys.INSTANCE.PARAM_REQUIRED, param) == true) {
                            required = true
                        }

                        if (StringUtils.isBlank(paramName)) {
                            paramName = param.name
                        }

                        PsiType paramType = param.type
                        PsiType unboxType = psiClassHelper.unboxArrayOrList(paramType)
                        PsiClass paramCls = PsiTypesUtil.getPsiClass(unboxType)
                        if (unboxType instanceof PsiPrimitiveType) { //primitive Type
                            if (defaultVal == null || defaultVal == "") {
                                defaultVal = PsiTypesUtil.getDefaultValue(unboxType)
                                //Primitive type parameter is required
                                //Optional primitive type parameter is present but cannot be translated into a null value due to being declared as a primitive type.
                                //Consider declaring it as object wrapper for the corresponding primitive type.
                                required = true
                            }
                        } else if (psiClassHelper.isNormalType(unboxType.canonicalText)) {//normal type
                            if (defaultVal == null || defaultVal == "") {
                                defaultVal = psiClassHelper.getDefaultValue(unboxType.canonicalText)
                            }
                        } else if (paramCls != null && ruleComputer.computer(ClassRuleKeys.INSTANCE.TYPE_IS_FILE, paramCls) == true) {
                            if (request.method == HttpMethod.GET) {
                                //can not upload file in a GET method
                                logger.error("Couldn't upload file in 'GET':[$request.method:${request.path}],param:${param.name} type:{${paramType.canonicalText}}")
                                return
                            }

                            if (request.method == HttpMethod.NO_METHOD) {
                                request.method = HttpMethod.POST
                            }

                            RequestHelperKt.addHeader(requestHelper, request, "Content-Type", "multipart/form-data")
                            RequestHelperKt.addFormFileParam(requestHelper, request, paramName, required, paramDesc)
                            return
                        } else if (SpringClassName.SPRING_REQUEST_RESPONSE.contains(unboxType.presentableText)) {
                            //ignore @HttpServletRequest and @HttpServletResponse
                            return
                        }

                        if (defaultVal != null) {
                            RequestHelperKt.addParam(requestHelper, request,
                                    paramName
                                    , defaultVal.toString()
                                    , required
                                    , paramDesc)
                        } else {
                            if (request.method == HttpMethod.GET) {
                                addParamAsQuery(param, request, requestHelper, paramDesc)
                            } else {
                                if (request.method == HttpMethod.NO_METHOD) {
                                    request.method = HttpMethod.POST
                                }
                                addParamAsForm(param, request, requestHelper, paramDesc)
                            }
                        }

                    }

                    void processMethod(PsiMethod method, KV<String, Object> kv, Request request, RequestHelper requestHelper) {

                        super.processMethod(method, kv, request, requestHelper)

                        String basePath = kv.getAs("basePath")
                        String ctrlHttpMethod = kv.getAs("ctrlHttpMethod")
                        PsiAnnotation requestMapping = findRequestMappingInAnn(method)
                        String httpMethod = findHttpMethod(requestMapping)
                        if (httpMethod == HttpMethod.NO_METHOD && ctrlHttpMethod != HttpMethod.NO_METHOD) {
                            httpMethod = ctrlHttpMethod
                        }
                        request.method = httpMethod

                        String httpPath = contractPath(basePath, findHttpPath(requestMapping))
                        requestHelper.setPath(request, httpPath)
                    }

                    private final String findHttpPath(PsiAnnotation requestMappingAnn) {
                        String path = PsiAnnotationUtils.INSTANCE.findAttr((PsiAnnotation) requestMappingAnn, ["path", "value"] as String[])
                        if (path != null) {
                            return StringUtils.substringBefore(path, ",")
                        } else {
                            return null
                        }
                    }

                    private final String findHttpMethod(PsiAnnotation requestMappingAnn) {
                        if (requestMappingAnn != null) {
                            String qualifiedName = requestMappingAnn.getQualifiedName()
                            if (qualifiedName == "org.springframework.web.bind.annotation.RequestMapping") {
                                String method = PsiAnnotationUtils.INSTANCE.findAttr(requestMappingAnn, ["method"] as String[])
                                if (method != null) {
                                    if (method.contains(",")) {
                                        method = StringUtils.substringBefore(method, ",")
                                    }

                                    if (StringUtils.isBlank(method)) {
                                        return "ALL"
                                    }
                                    if (method.startsWith("RequestMethod.")) {
                                        return StringUtils.removeStart(method, "RequestMethod.")
                                    }
                                    if (method.contains("RequestMethod.")) {
                                        return StringUtils.substringAfterLast(method, "RequestMethod.")
                                    }

                                    return method
                                }

                                return "ALL";
                            }

                            if (qualifiedName == "org.springframework.web.bind.annotation.GetMapping") {
                                return "GET"
                            }
                            if (qualifiedName == "org.springframework.web.bind.annotation.PostMapping") {
                                return "POST"
                            }
                            if (qualifiedName == "org.springframework.web.bind.annotation.DeleteMapping") {
                                return "DELETE"
                            }

                            if (qualifiedName == "org.springframework.web.bind.annotation.PatchMapping") {
                                return "PATCH"
                            }
                            if (qualifiedName == "org.springframework.web.bind.annotation.PutMapping") {
                                return "PUT"
                            }
                        }

                        return "ALL"
                    }

                    private final PsiAnnotation findRequestMapping(PsiClass psiClass) {
                        PsiAnnotation requestMappingAnn = this.findRequestMappingInAnn(psiClass)
                        if (requestMappingAnn != null) {
                            return requestMappingAnn
                        } else {
                            for (PsiClass superCls = psiClass.getSuperClass(); superCls != null; superCls = superCls.getSuperClass()) {
                                PsiAnnotation requestMappingAnnInSuper = this.findRequestMappingInAnn(superCls)
                                if (requestMappingAnnInSuper != null) {
                                    return requestMappingAnnInSuper
                                }
                            }

                            return null
                        }
                    }

                    private final PsiAnnotation findRequestMappingInAnn(PsiModifierListOwner ele) {
                        for (String ann in SpringClassName.SPRING_REQUEST_MAPPING_ANNOTATIONS) {
                            PsiAnnotation psiAnnotation = PsiAnnotationUtils.INSTANCE.findAnn(ele, ann)
                            if (psiAnnotation != null) {
                                return psiAnnotation
                            }
                        }
                        return null
                    }

                    private final PsiAnnotation findRequestBody(PsiParameter parameter) {
                        return PsiAnnotationUtils.INSTANCE.findAnn(parameter, "org.springframework.web.bind.annotation.RequestBody")
                    }

                    private final PsiAnnotation findModelAttr(PsiParameter parameter) {
                        return PsiAnnotationUtils.INSTANCE.findAnn(parameter, "org.springframework.web.bind.annotation.ModelAttribute")
                    }

                    private final PsiAnnotation findRequestHeader(PsiParameter parameter) {
                        return PsiAnnotationUtils.INSTANCE.findAnn(parameter, "org.springframework.web.bind.annotation.RequestHeader")
                    }

                    private final PsiAnnotation findPathVariable(PsiParameter parameter) {
                        return PsiAnnotationUtils.INSTANCE.findAnn(parameter, "org.springframework.web.bind.annotation.PathVariable")
                    }

                    private final PsiAnnotation findRequestParam(PsiParameter parameter) {
                        return PsiAnnotationUtils.INSTANCE.findAnn(parameter, "org.springframework.web.bind.annotation.RequestParam")
                    }

                    private final String findParamName(PsiAnnotation requestParamAnn) {
                        return PsiAnnotationUtils.INSTANCE.findAttr(requestParamAnn, ["name", "value"] as String[])
                    }

                    private final Boolean findParamRequired(PsiAnnotation requestParamAnn) {
                        String required = PsiAnnotationUtils.INSTANCE.findAttr(requestParamAnn, ["required"] as String[]);
                        if (required != null) {
                            return !required.contains("false")
                        } else {
                            return null
                        }
                    }
                }
            }
            </blockcode>
        </details>
## 使用方法

* 导出Api(0.8.2.1+)
```textCode
    1. 打开已存在的 Spring Controller文件或者从project navigation中选择文件或者目录
       使用快捷键 : "alt shift E(windows)/ctrl E(mac)"
    2. 选择 apis 和 channel
    3. 单击[✔️]按钮或按Enter键
```

* 导出Yapi
```textCode
    导出api的两种方法:
    1. 打开已存在的 Spring Controller文件
       在打开的文件中右键单击选择 "generate..."或者使用快捷键"[Alt + Insert]/[Ctrl+Enter]" , 然后选择 "ExportYapi"
    2. 从project navigation中选择文件或者目录
        点击顶部的[Code -> ExportYapi]"
```

* 导出到Postman
```textCode
    导出api的两种方法:
    1. 打开已存在的 Spring Controller文件
       在打开的文件中右键单击选择 "generate..."或者使用快捷键"[Alt + Insert]/[Ctrl+Enter]" , 然后选择 "ExportPostman"
    2. 从project navigation中选择文件或者目录
        点击顶部的[Code -> ExportPostman]"
```

* 导出到MarkDown(Beta)
```textCode
    导出api的两种方法:
    1. 打开已存在的 Spring Controller文件
       在打开的文件中右键单击选择 "generate..."或者使用快捷键"[Alt + Insert]/[Ctrl+Enter]" , 然后选择 "ExportMarkdown"
    2. 从project navigation中选择文件或者目录
        点击顶部的[Code -> ExportMarkdown]"
```

* 如何自动导出到postman?
 
```text
    依次点击 [Preference -> Other Setting -> EasyApi]
    设置postman私有token
    如果你没有postman的私有token，您可以通过前往Postman Integrations Dashboard轻松生成一个
    [https://go.postman.co/integrations/services/pm_pro_api]
```

* 在代码中快速使用API 

```textCode
    打开已存在的 Spring Controller文件
    在打开的文件中右键单击选择 "generate..."或者使用快捷键"[Alt + Insert]/[Ctrl+Enter]" , 然后选择"Call"
```

* ApiDashBoard
```textCode
    通过拖动很容易将当前项目中的api导出到api
    “在顶部点击[Code - > ApiDashBoard]”
```

* YApiDashBoard
```textCode
    通过拖动很容易将当前项目中的api导出到yapi
    “在顶部点击[Code - > YApiDashBoard]”
```


## 特征
- [X] 支持Spring
- [X] 导出api到Postman
- [X] 导出api到Yapi
- [ ] 导出api到Word
- [X] 导出api到Markdown
- [X] 在代码中调用api
- [X] Api DashBoard
- [X] YApi DashBoard
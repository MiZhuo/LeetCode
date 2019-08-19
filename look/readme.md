<h1 align="center"><font face="STCAIYUN">Easy-yapi</font></h1>
<p align="center">
    <a href="https://plugins.jetbrains.com/plugin/12458-easyyapi" target="_blank">
        <img src="https://img.shields.io/jetbrains/plugin/v/12458?color=blue&label=version" width=""/>
    </a>
    <a href="https://plugins.jetbrains.com/plugin/12458-easyyapi" target="_blank">
        <img src="https://img.shields.io/jetbrains/plugin/d/12458" width=""/>
    </a>
</p>

## Introduction

- Customized [easyApi](https://github.com/tangcent/easy-api) for [yapi](https://github.com/YMFE/yapi)

- [中文](https://github.com/tangcent/easy-yapi/blob/master/README_cn.md) | [English](https://github.com/tangcent/easy-yapi/blob/master/README.md)

- [demo](https://github.com/tangcent/spring-demo)

- Add support for yapi based on [easy-api](https://github.com/tangcent/easy-api)

  This is also a good example if you are interested in easy-api or want to support other third-party API management platforms,By comparing the differences between [easy-api](https://github.com/tangcent/easy-api) and [easy-yapi](https://github.com/tangcent/easy-yapi), you can learn how to develop on the basis of  [easy-api](https://github.com/tangcent/easy-api) to enable it to support third-party API management platforms.


## Javadoc

- [wiki](https://en.wikipedia.org/wiki/Javadoc)
- [oracle](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html)
- [baike](https://baike.baidu.com/item/javadoc)


# Catalog
 - <a href = '#span10'>Tips
 - <a href = '#span9'>Version
 - <a href = '#span8'>Installation
    - <a href = '#span3'>Using IDE plugin system</a>
    - <a href = '#span4'>Manual</a>
 - <a href = '#span7'>ParameterConfiguration
    - <a href = '#span1'>Yapi related parameter configuration</a>
    - <a href = '#span2'>Personalized configuration</a>
 - <a href = '#span5'>Guide
 - <a href = '#span6'>Feature

## <span id = "span10">Tips</span>
Before the 1.0.0 release, easy-yapi will be quick iteration.
If you encounter a failure
1. Please commit a issue.
2. Try roll back to the previous version.
3. Feel free to email [me](mailto:pentatangcent@gmail.com) at any time.

## <span id = "span9">Version</span>

`$major.$minor.$min_support.$max_support.$fix`

## <span id = "span8">Installation</span>

**support following product build version > 173(2017.3)**

- IntelliJ IDEA
- IntelliJ IDEA Community Edition

#### <span id = 'span3' style="color: #6495ED"> > Using IDE plugin system </span>
- <kbd>Preferences(Settings)</kbd> > <kbd>Plugins</kbd> > <kbd>Browse repositories...</kbd> > <kbd>find"EasyYapi"</kbd> > <kbd>Install Plugin</kbd>

#### <span id = 'span4' style="color: #6495ED"> > Manual</span>
- download from [Jetbrains](https://plugins.jetbrains.com/plugin/12458-easyyapi) or [Github](https://github.com/tangcent/easy-yapi-plugins/raw/master/idea/easy-yapi.jar) -> <kbd>Preferences(Settings)</kbd> > <kbd>Plugins</kbd> > <kbd>Install plugin from disk...</kbd>

Restart the  **IDE** after the installation is complete.

## <span id = "span7">ParameterConfiguration</span>

#### <span id='span1' style="color: #6495ED">Yapi related parameter configuration</span>

- If yapi related parameters are needed during the export process, the input will be provided as a popup window.
- It can also be manually configured in  <kbd>Preferences(Settings)</kbd> >  <kbd>Other Settings</kbd> > <kbd>EasyApi</kbd>.When using this plugin for the first time,it is recommended to enable <font style="color: red">inferEnable</font>,which will allow the plugin to attempt to infer through the code stream when encountering an indeterminate method return type<font style="color: red">(Object,Some\<Object>)</font>and set <font style="color: red">maxDeep</font>(maximum inferred depth) according to the project requirements. 
- The parameters that need to be provided are
    - `server`：That is, the deployed yapi address.Such as:http://127.0.0.1:3000/
    - `tokens`：That is, the private token used to request the project openapi in the yapi project, the way to get it is <kbd>Project</kbd>><kbd>Settings</kbd>><kbd>Token Configuration</kbd> > <kbd> Tool ID</kbd>
#### <span id='span2' style="color: #6495ED">Personalized Configuration</font>
Because there are so many plug-ins now, the situation where the shortcut keys are occupied sometimes occurs. In addition, the shortcut keys used by developers are different, so easy-yapi basically does not set the default shortcut keys. If you need shortcut keys, you can use the IDE yourself. Set in.
 - ##### [Support for additional configuration](https://github.com/tangcent/easy-yapi/wiki/1.-%E6%94%AF%E6%8C%81%E9%A2%9D%E5%A4%96%E9%85%8D%E7%BD%AE)
    - Add the configuration file to the project root directory
    - <font style="color: red; background:yellow">[.easy.api.config]</font> is valid for all operations
    - <font style="color: red; background:yellow">[.postman.config]</font> is valid for Postman related operations
    - <font style="color: red; background:yellow">[.yapi.config]</font> is valid for Yapi related operations
- ##### [Supported configuration ruless](https://github.com/tangcent/easy-yapi/wiki/2.-%E6%94%AF%E6%8C%81%E7%9A%84%E9%85%8D%E7%BD%AE%E8%A7%84%E5%88%99)
    - Supported rules

        | Rule key |Rule target (context)| Version  | Rule description |
        | :-------------: |:-------------:| :-----:| :------:|
        |  module|	class|	v0.7.2+	|Grouping apis|
        |ignore|	class/method	|v0.7.2+	|Ignore the API|
        | json.rule.field.name |	field|	v0.7.2+|	Set the field name of the output (for the field name in json is inconsistent with the field name in the class)|
        |json.rule.field.ignore|	field|	v0.7.2+	|Ignore fields (set some fields do not appear in json, or are given when no request is required)|
        |json.rule.convert|	-|	v0.7.2+	|Used to set some types of conversions to other types of processing, usually for use with Spring's custom type converters|
        |doc.field|	field|v0.7.2+|	Additional comments for the field|
        |doc.method|	method|	v0.7.2+|	Additional comments for methods (api)|
        |param.required|	arg|	v0.7.3+	|Whether the API parameter is mandatory (not nullable)|
        |field.required	|field|	v0.7.3+	|Whether the field is mandatory (not nullable)|
        |api.tag|	method|	v0.7.5+|	Tag interface tag|
        |api.status	|method|	v0.8.0+	|Tag interface status (should return done/undone)|
    - Simple rule
        -  <font style="color: red; background:yellow"># </font>Read the tag on the comment
        -  <font style="color: red; background:yellow">@ </font>Read annotation
        -  <font style="color: red; background:yellow">@xxx </font>Read annotations on methods or fields
        -  <font style="color: red; background:yellow">@xxx#yyy </font>Read the `attr` value in an annotation on a method or field
    - Advanced scripting rules (beta)
        - Since the js engine may be missing after JDK11, it is recommended to use [groovy] (https://baike.baidu.com/item/Groovy/180590) as the first choice.
        - [groovy](https://baike.baidu.com/item/Groovy/180590) :The rule is `groovy:groovyScript`
        - js: The rule is  `js:jsScript`
        - The default injection [it] in the script indicates the application object of the current rule. The application object only provides the method <font style="color: red; background:yellow">[it.method()✅]</font>, no attribute is provided <font style="color: red; background:yellow">[it.property❎]</font>.
        - For class (class), method (method / API), field (field / property), arg (parameter) supports the following methods:
		
            | Method | Return Value | Description | Examples |
            | :-------------: | :-------------: | :-----: | :------ |  
            | name() | String | name | it.name() |
            |hasAnn("annotation_name") | boolean|	Is there a specified annotation?|	it.hasAnn("org.springframework.web.bind.annotation.RequestBody")|
            |ann("annotation_name")	|String	|Get the specified annotation value (default value)|	it.ann("org.springframework.web.bind.annotation.RequestBody")|
            |ann("annotation_name","attr")	|String|	Get the specified parameter value in the specified annotation|	it.ann("org.springframework.web.bind.annotation.RequestMapping","path")|
            |doc()|	String|	Get the comment value|	it.doc()|
            |doc("tag")	|String|	Get the annotation tag value (no need to add @)|	it.doc("return")|
            |doc("tag","subTag")|	String	|Get the secondary annotation tag value	| it.doc("param","a")|
            |hasDoc("tag")	|String	|Is there a comment tag specified?|	it.hasDoc("ignore")|
    - Different application objects provide additional methods|
        - class
		
          | Method | Return Value | Description | Examples |
            | :-------------: | :-------------: | :-----: | :------: |  
            |methods()|	method[]|	All methods in the class|	it.methods()|
            |methodCnt()	|int|	Number of methods in the class|	it.methodCnt()|
            |field()	|int	|All fields in the class|	it.field()|
           | fieldCnt()|	int	|Number of fields in the class|	it.fieldCnt()|
            |isExtend()|	boolean|	Whether to inherit a class|	it.isExtend()|
            |isMap()	|boolean	|Is it Map?	|it.isMap()|
            |isCollection()	|boolean	|Whether it is a collection|	it.isCollection()|
            |isArray()	|boolean|	Is it an array?|	it.isArray()|
        - method
		
          | Method | Return Value | Description | Examples |
           | :-------------: | :-------------: | :-----: | :------: |  
            |returnType()|	class	|Method return type	|it.returnType()|
            | isVarArgs()	|boolean	|Is there any uncertainty?	|it.isVarArgs()|
            |args()|	arg[]	|All parameters of the method	|it.args()|
            |argTypes()	|class[]	|All parameter types of the method	|it.argTypes()|
            |argCnt()	|int|	Number of method parameters|	it.argCnt()|
            |containingClass()|	class	|Method belongs to class	|it.containingClass()|
        - field
		
          | Method | Return Value | Description | Examples |
            | :-------------: | :-------------: | :-----: | :------: |  
            | type()	|class|	Field Type|	it.type()|
            |containingClass()|	class	|Method belongs to class|	it.containingClass()|
            |jsonName()	|class|	Field json name|	it.jsonName()|
        - arg
		
            | Method | Return Value | Description | Examples |
            | :-------------: | :-------------: | :-----: | :------: |  
            |type()|	class|	Parameter Type|	it.type()|
            |isVarArgs()|	boolean	|Whether it is uncertain|	it.isVarArgs()|
- ##### [yapi mock configuration](https://github.com/tangcent/easy-yapi/wiki/3.-yapi-mock%E9%85%8D%E7%BD%AE)
    - Two profiles are available
        - <font style="color: red; background:yellow">[.yapi.config]</font>Only valid for export to yapi
        - <font style="color: red; background:yellow">[.easy.api.config]\(Recommend)</font>Valid for all API export operations
    - Add custom `mock` rules(beta)
        <details>     
            <summary style = "color:red;font-size:18px">Click to view example</summary>   
                <blockcode>

            ## Add custom mock rules
            #mockjs Official example: http://mockjs.com/examples.html
            #Define some basic rules
            #Chinese mobile phone number
            phone=1@pick(["34","35","36","37","38","39","50","5","52","58","59","57","82","87","88","70","47","30","3","32","55","56","85","86","33","53","80","89"])@string("number", 8)
            #Millisecond timestamp
            mtimestamp=@timestamp@string("number", 3)
            #0-9
            digit=@natural(0,9)
            #Natural number less than 1000
            natural_lt_1000=@natural(0,1000)
            #Two decimal places
            float_with_two=@natural(0,10000).@natural(0,100)
            #http url
            http_url=@pick(["http","https"])://www.@domain()/@string('lower',1,8)?@string('lower',2,4)=@string('number',1,2)
            #objectId just characters and digits, not meeting specific agreements
            objectId=@string("0123456789abcdef",24,24) 
        </details>

    - You can use the rules provided by `mockjs` with custom rules to customize the `mock` information that is output to `YAPI`.
        <details>     
            <summary style = "color:red;font-size:18px">Click to view example</summary>   
                <blockcode>
        
            #Common response mock
            mock.[c|integer]=0
            mock.[code|integer]=0
            mock.[status|integer]=0
            mock.[ok|boolean]=true
            mock.[success|boolean]=true
            mock.[m|string]=
            mock.[msg|string]=
            mock.[message|string]=
            mock.[errMsg|string]=
            #Common pagination mock
            mock.[*.p|integer]=1
            mock.[*.l|integer]=@pick(["10","15","100"])
            mock.[*.t|integer]=@natural(0,1000)
            mock.[*.offset|integer]=1
            mock.[*.limit|integer]=@pick(["10","15","100"])
            mock.[*.total|integer]=@natural(0,1000)

            # Integer xxxTime mock is timestamp
            mock.[*Time|integer]=${mtimestamp}

            #Gender
            mock.[*.sex|integer]=@natural(0,2)
            mock.[*.sex|string]=@pick(["Male","Female"])
            mock.[*.gender|integer]=@natural(0,2)
            mock.[*.gender|string]=@pick(["Male","Female"])

            //User information related
            mock.[*.phone|string]=${phone}
            mock.[*Phone|string]=${phone}
            mock.[*.provinceName|string]=@province
            mock.[*ProvinceName|string]=@province
            mock.[*.cityName|string]=@city
            mock.[*CityName|string]=@city
            mock.[*.districtName|string]=@county
            mock.[*DistrictName|string]=@county
            mock.[*.address]=@cword(2,3)Road@natural(1,1500)

            #Link
            mock.[*.url|string]=${http_url}
            mock.[*.link|string]=${http_url}
            mock.[*.linkUrl|string]=${http_url}
            mock.[*Link|string]=${http_url}

            # Integer and number are more natural
            mock.[*Type|integer]=${digit}
            mock.[*Status|integer]=${digit}
            mock.[*.type|integer]=${digit}
            mock.[*.status|integer]=${digit}
            mock.[*|integer]=@natural(0,10000)
            mock.[*|number]=@float(0,10000)
        </details>
- ##### [Configuration demo](https://github.com/tangcent/easy-yapi/wiki/4.-%E9%85%8D%E7%BD%AEdemo)
    <details>     
    <summary style = "color:red;font-size:18px">Click to view example</summary>   
        <blockcode>
         
        #yapi mock rule---------------------------------------
        #Mockjs official example: http://mockjs.com/examples.html
        #Define some basic rules
        #phone number
        phone=1@pick(["34","35","36","37","38","39","50","5","52","58","59","57","82","87","88","70","47","30","3","32","55","56","85","86","33","53","80","89"])@string("number", 8)
        #Millisecond timestamp
        mtimestamp=@timestamp@string("number", 3)
        #0-9
        digit=@natural(0,9)
        #Natural number less than 1000
        natural_lt_1000=@natural(0,1000)
        #Two decimal places
        float_with_two=@natural(0,10000).@natural(0,100)
        #mj-img
        img=@string("0123456789abcdef",32,32).@pick(["gif","bmp","jpg","jpeg","png"])
        #http url
        http_url=@pick(["http","https"])://www.@domain()/@string('lower',1,8)?@string('lower',2,4)=@string('number',1,2)
        #objectId is just a character and a number of bits, not meeting the specific protocol
        objectId=@string("0123456789abcdef",24,24)
        #Common response mock
        mock.[c|integer]=0
        mock.[code|integer]=0
        mock.[status|integer]=0
        mock.[ok|boolean]=true
        mock.[success|boolean]=true
        mock.[m|string]=
        mock.[msg|string]=
        mock.[message|string]=
        mock.[errMsg|string]=

        #Common pagination mock
        mock.[*.p|integer]=1
        mock.[*.l|integer]=@pick(["10","15","100"])
        mock.[*.t|integer]=@natural(0,1000)
        mock.[*.offset|integer]=1
        mock.[*.limit|integer]=@pick(["10","15","100"])
        mock.[*.total|integer]=@natural(0,1000)

        #Integer xxxTime mock is timestamp
        mock.[*Time|integer]=${mtimestamp}

        #Gender
        mock.[*.sex|integer]=@natural(0,2)
        mock.[*.sex|string]=@pick(["Male","Female"])

        //User information related
        mock.[*.phone|string]=${phone}
        mock.[*Phone|string]=${phone}
        mock.[*.provinceName|string]=@province
        mock.[*ProvinceName|string]=@province
        mock.[*.cityName|string]=@city
        mock.[*CityName|string]=@city
        mock.[*.districtName|string]=@county
        mock.[*DistrictName|string]=@county
        mock.[*.address]=@cword(2,3)road @natural(1,1500)

        #Link
        mock.[*.url|string]=${http_url}
        mock.[*.link|string]=${http_url}
        mock.[*.linkUrl|string]=${http_url}
        mock.[*Link|string]=${http_url}

        # Integer and number are more natural
        mock.[*Type|integer]=${digit}
        mock.[*Status|integer]=${digit}
        mock.[*.type|integer]=${digit}
        mock.[*.status|integer]=${digit}
        mock.[*|integer]=@natural(0,10000)
        mock.[*|number]=@float(0,10000)

        # @Express annotation #Representation tag

        #Get the module from the annotation, which item to import into yapi
        module=#module

        #Ignore not parsing
        ignore=#ignore

        #Additional json parsing rules
        #Support for jackson annotation
        json.rule.field.name=@com.fasterxml.jackson.annotation.JsonProperty#value
        #ObjectId and Date are treated as String
        json.rule.convert[org.bson.types.ObjectId]=java.lang.String
        json.rule.convert[java.util.Date]=java.lang.String
    </details>

- [Support for local groovy extensions](https://github.com/tangcent/easy-yapi/wiki/5.-%E6%94%AF%E6%8C%81%E6%9C%AC%E5%9C%B0groovy%E6%89%A9%E5%B1%95)
    <strong>
        <font style="color:red; background:yellow" size='4'>Note: Local groovy extensions require a certain understanding of the structure of groovy and the current plugin.</font>
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
            <summary style = "color:red;font-size:18px">Click to view demo</summary>   
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

## <span id = "span5">Guide</span>

* [Custom config for project](https://github.com/tangcent/easy-yapi/wiki/1.-%E6%94%AF%E6%8C%81%E9%A2%9D%E5%A4%96%E9%85%8D%E7%BD%AE)

* ExportApi(0.8.2.1+)
```textCode
    1. Open existed Spring Controller File Or Select files or directories from project navigation
    You can use by this : "alt shift E(windows)/ctrl E(mac)"
    2. Select apis and channel
    3. Click [✔️] button or press enter key
```

* ExportYapi
```textCode
    There are two ways to export api.
    1. Open existed Spring Controller File
    You can use by this : "Right click in the file -> generate... " or use its shortcuts "[Alt + Insert]/[Ctrl+Enter]" , then
    choose the action "ExportYapi"
    2. Select files or directories from project navigation
    You can use by this : "Click [Code -> ExportYapi] in top"
```

* ExportPostman
```textCode
    There are two ways to export api.
    1. Open existed Spring Controller File
    You can use by this : "Right click in the file -> generate... " or use its shortcuts "[Alt + Insert]/[Ctrl+Enter]" , then
    choose the action "ExportPostman"
    2. Select files or directories from project navigation
    You can use by this : "Click [Code -> ExportPostman] in top"
```

* How to export to postman automatically?
 
```text
    Click [Preference -> Other Setting -> EasyApi]
    set postman privatetoken
    If you do not have a privateToken of postman,
    you can easily generate one by heading over to the Postman Integrations Dashboard
    [https://go.postman.co/integrations/services/pm_pro_api]
```

* Quick API requests from code

```textCode
    Open existed Spring Controller File
    You can use by this : "Right click in the file -> generate... " or use its shortcuts "[Alt + Insert]/[Ctrl+Enter]" , then
    choose the action "Call"
```

* ApiDashBoard
```textCode
    It is easily to export api in current project to postman by dragging
    You can use by this : "Click [Code -> ApiDashBoard] in top"
```

* YApiDashBoard
```textCode
    It is easily to export api in current project to yapi by dragging
    You can use by this : "Click [Code -> YApiDashBoard] in top"
```

* ExportMarkdown(Beta)
```textCode
    There are two ways to export api.
    1. Open existed Spring Controller File
    You can use by this : "Right click in the file -> generate... " or use its shortcuts "[Alt + Insert]/[Ctrl+Enter]" , then
    choose the action "ExportMarkdown"
    2. Select files or directories from project navigation
    You can use by this : "Click [Code -> ExportMarkdown] in top"
```

## <span id = "span6">Feature</span>
- [X] Support Spring
- [X] Export api to Postman
- [X] Export api to Yapi
- [ ] Export api to Word
- [X] Export api to Markdown
- [X] Call api from code
- [X] Api DashBoard
- [X] YApi DashBoard

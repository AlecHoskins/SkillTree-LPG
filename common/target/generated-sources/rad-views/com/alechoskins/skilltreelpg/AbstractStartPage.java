package com.alechoskins.skilltreelpg;
import com.codename1.rad.annotations.RAD;
import com.codename1.rad.ui.AbstractEntityView;
import com.codename1.rad.ui.EntityView;
import com.codename1.rad.models.Entity;
import com.codename1.rad.nodes.Node;
import com.codename1.io.CharArrayReader;
import com.codename1.rad.ui.ViewContext;
@RAD
public abstract class AbstractStartPage<T extends Entity>  extends AbstractEntityView<T> {
    private static final String FRAGMENT_XML="<?xml version=\"1.0\" encoding=\"UTF-8\"?><y xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" rad-id=\"0\" safeArea=\"true\" scrollableY=\"true\" style.bgColor=\"0xffffff\" style.bgTransparency=\"0xff\" style.paddingBottom=\"5vw\" style.paddingLeft=\"5vw\" style.paddingRight=\"5vw\" style.paddingTop=\"5vw\" xsi:noNamespaceSchemaLocation=\"StartPage.xsd\">\r\n    <title hidden=\"true\" rad-id=\"1\"/>\r\n\r\n    <center rad-id=\"2\" style.marginBottom=\"2rem\">\r\n        <label icon=\"https://www.codenameone.com/wp-content/uploads/2020/08/footer-logo.png height:25vh; aspect:1.5; scale:fit\" rad-id=\"3\"/>\r\n    </center>\r\n\r\n\r\n    <spanLabel rad-id=\"4\" style.marginBottom=\"1rem\" textUIID=\"StartPageText\">This is the CodeRAD2 starter template for building native mobile apps in Java and Kotlin</spanLabel>\r\n\r\n    <spanLabel rad-id=\"5\" textUIID=\"StartPageText\">CodeRAD is an MVC framework for Codename One that will help to build better, more maintainable apps in less time.</spanLabel>\r\n\r\n    <button rad-href=\"https://shannah.github.io/CodeRAD/manual _blank\" rad-id=\"6\">Learn more</button>\r\n\r\n    <label rad-id=\"7\" uiid=\"StartPageH2\">Source Code Overview</label>\r\n\r\n    <spanLabel rad-id=\"8\" textUIID=\"StartPageText\">This template is barebones, consisting of one view, one controller, and a stylesheet.</spanLabel>\r\n\r\n\r\n    <button materialIcon=\"FontImage.MATERIAL_ARROW_RIGHT\" rad-href=\"https://github.com/shannah/coderad2-starter-template/blob/master/common/src/main/rad/views/com/example/myapp/StartPage.xml _blank\" rad-id=\"9\" textPosition=\"Component.LEFT\" uiid=\"StartPageLink\">See \"View\" source</button>\r\n    <button materialIcon=\"FontImage.MATERIAL_ARROW_RIGHT\" rad-href=\"https://github.com/shannah/coderad2-starter-template/blob/master/common/src/main/java/com/example/myapp/MyRADApp.java _blank\" rad-id=\"10\" textPosition=\"Component.LEFT\" uiid=\"StartPageLink\">See \"Controller\" source</button>\r\n    <button materialIcon=\"FontImage.MATERIAL_ARROW_RIGHT\" rad-href=\"https://github.com/shannah/coderad2-starter-template/blob/master/common/src/main/css/theme.css _blank\" rad-id=\"11\" textPosition=\"Component.LEFT\" uiid=\"StartPageLink\">See Stylesheet source</button>\r\n</y>";
    public AbstractStartPage(ViewContext<T> context) {
        super(context);
    }

}

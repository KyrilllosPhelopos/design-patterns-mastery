//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    MessageFormattingSevice jsonMessageFormatting = new MessageFormattingSevice(new XmlMessageFormatter());
    MessageFormattingSevice xmlMessageFormatter = new MessageFormattingSevice(new JsonMessageFomatter());
    MessageFormattingSevice plainTextMessageFormatter = new MessageFormattingSevice(new PlainTextMessageFormatter());

    String json_str =   "{ \"name\": \"Kyrillos\", \"age\": 25, \"isDeveloper\": true }";
    jsonMessageFormatting.messageFormat(json_str);

    String xml = "<user><name>Kyrillos</name><age>25</age></user>";

    xmlMessageFormatter.messageFormat(xml);
    plainTextMessageFormatter.messageFormat("Plain text message");


}

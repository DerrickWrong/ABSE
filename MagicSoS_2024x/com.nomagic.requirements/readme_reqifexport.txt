Usage:

reqifexport project_descriptor=<project URL> reqif_file=<path to ReqIF file> export_type=<specifications|elements> elements=<hyperlinks or qualified names of elements> [source_tool_id=<ReqIF flavor>] [server=<server address> username=<user login name> password=<user password>]

Arguments:
"project_descriptor" - URL of the project (project descriptor). To get the project descriptor - start MagicDraw, open project, select menu "File"->"Project Properties", "General" tab, see "Project Descriptor" field.
"reqif_file" - path to the ReqIF file to export.
"export_type" - specifications or elements can be exported, so the argument value is "specifications" or "elements"
"elements" - hyperlinks or qualified names (or mix of both) of the elements to export, separated by semicolon (;) symbol. To get the element URL  - start MagicDraw, open project, select element in the browser, invoke popup menu and select "Copy Element Hyperlink" menu item.
"source_tool_id" - the flavor of the ReqIF. Currently supported flavors are "MagicDraw", "IBM Rational DOORS", "Polarion", "Teamcenter", "Reqtify".
Teamwork Cloud arguments (in case project descriptor for TWC project is provided):
"server" - TWC server name or IP address to connect to.
"username" - user name to login with.
"password" - password for the specified TWC user
"project_password" - password for the specified Teamwork Cloud project (optional, needed only if project is password protected)

Important: If you need a space in the path surround the argument with escaped (\") quote.
E.g.
reqifexport <...> \"reqif_file=d:\My File.reqif\"

It is possible to specify arguments using properties file - create properties file with arguments as properties, and specify the path to the properties file through "properties_file" argument:

reqifexport properties_file=<path to properties file>

Properties file example:
# start of the properties file
project_descriptor=file:/c:/project.mdzip
reqif_file=c:\\output.reqif
export_type=specifications
elements=myPackage::myPackage1;myPackage::myPackage1
source_tool_id=MagicDraw
# end of the properties file


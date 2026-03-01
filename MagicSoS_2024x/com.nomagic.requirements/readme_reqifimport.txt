Usage:

reqifimport project_descriptor=<project URL> reqif_file=<path to ReqIF file> [owner=<element hyperlink or qualified name>] [server=<server address> username=<login_name> password=<login password>]

Arguments:
"project_descriptor" - URL of the project (project descriptor). To get the project descriptor - start MagicDraw, open project, select menu "File"->"Project Properties", "General" tab, see "Project Descriptor" field.
"reqif_file" - path to the ReqIF file to import.
"owner" - hyperlink or qualified name of the owner element. If newly imported elements are not contained by the Specification element, they are placed under the specified owner. To get the element hyperlink  - start MagicDraw, open project, select element in the browser, invoke popup menu and select "Copy Element Hyperlink" menu item.
Teamwork Cloud arguments (in case project descriptor for TWC project is provided):
"server" - TWC server name or IP address to connect to.
"username" - user name to login with.
"password" = password for the specified TWC user
"project_password" - password for the specified Teamwork Cloud project (optional, needed only if project is password protected)

Important: If you need a space in the path surround the argument with escaped (\") quote.
E.g.
reqifimport <...> \"reqif_file=d:\My File.reqif\"

It is possible to specify arguments using properties file - create properties file with arguments as properties, and specify the path to the properties file through "properties_file" argument:

reqifimport properties_file=<path to properties file>

Properties file example:
# start of the properties file
project_descriptor=file:/c:/project.mdzip
reqif_file=c:\\input.reqif
owner=myPackage::myPackage1
# end of the properties file


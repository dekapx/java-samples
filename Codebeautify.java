public class Codebeautify {
 CDSEntitlements CDSEntitlementsObject;


 // Getter Methods 

 public CDSEntitlements getCDSEntitlements() {
  return CDSEntitlementsObject;
 }

 // Setter Methods 

 public void setCDSEntitlements(CDSEntitlements CDSEntitlementsObject) {
  this.CDSEntitlementsObject = CDSEntitlementsObject;
 }
}
public class CDSEntitlements {
 Commands CommandsObject;


 // Getter Methods 

 public Commands getCommands() {
  return CommandsObject;
 }

 // Setter Methods 

 public void setCommands(Commands CommandsObject) {
  this.CommandsObject = CommandsObject;
 }
}
public class Commands {
 Command CommandObject;


 // Getter Methods 

 public Command getCommand() {
  return CommandObject;
 }

 // Setter Methods 

 public void setCommand(Command CommandObject) {
  this.CommandObject = CommandObject;
 }
}
public class Command {
 ClientProfileAccount ClientProfileAccountObject;
 private String _Action;
 private String _ModuleName;
 private String _Destination;


 // Getter Methods 

 public ClientProfileAccount getClientProfileAccount() {
  return ClientProfileAccountObject;
 }

 public String get_Action() {
  return _Action;
 }

 public String get_ModuleName() {
  return _ModuleName;
 }

 public String get_Destination() {
  return _Destination;
 }

 // Setter Methods 

 public void setClientProfileAccount(ClientProfileAccount ClientProfileAccountObject) {
  this.ClientProfileAccountObject = ClientProfileAccountObject;
 }

 public void set_Action(String _Action) {
  this._Action = _Action;
 }

 public void set_ModuleName(String _ModuleName) {
  this._ModuleName = _ModuleName;
 }

 public void set_Destination(String _Destination) {
  this._Destination = _Destination;
 }
}
public class ClientProfileAccount {
 private String _ClientProfileAccountIntId;


 // Getter Methods 

 public String get_ClientProfileAccountIntId() {
  return _ClientProfileAccountIntId;
 }

 // Setter Methods 

 public void set_ClientProfileAccountIntId(String _ClientProfileAccountIntId) {
  this._ClientProfileAccountIntId = _ClientProfileAccountIntId;
 }
}
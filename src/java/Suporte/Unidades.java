
package suporte;



public class Unidades {
    String html= "";
    
    public  Unidades (){
    html +="<select name=\"unidade\">";
    html +="<option value=\"PC\" selected>PC</option>";
    html +="<option value=\"KG\">KG</option>";
    html +="<option value=\"UN\">UN</option>";
    html +="</select>"; 
    }
    
    public String getUnidades(){
        return html;
    }
    
}

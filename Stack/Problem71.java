class Solution {
    public String simplifyPath(String path) {
       Stack<String> stack =  new Stack<>();
       String[] components = path.split("/");
       for(String component:components){
        if(component.equals("..")){
            if(!stack.isEmpty()){
            stack.pop();

            }
        }
        else if(!component.equals(".") && !component.isEmpty()){
            stack.push(component);
        }
       }
        StringBuilder simplifiedPath = new StringBuilder();
        for(String directory:stack){
            simplifiedPath.append("/");
            simplifiedPath.append(directory);
        }
       return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";
    }
}

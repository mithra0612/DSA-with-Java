class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
     int count = 0;
     int n = items.size();
     int m = 3;
     int key = 0;
     switch(ruleKey){
        case "type":{
            key=0;
            break;
        }
        case "color":{
            key=1;
            break;
        }
        case "name":{
            key=2;
            break;
        }
        default :{
            key=-1;
            break;
        }
    }
     for(int i = 0;i<n;i++){        
        if(items.get(i).get(key).equals(ruleValue)){
            count++;
        }
       }
     return count;
    }
}
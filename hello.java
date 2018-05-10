if(num4.getText().toString().equals(""))
                 {
                     flag=1;
                     n2=0;
                 }
                 else
                 {
                     try{
                         n2=Integer.parseInt(num4.getText().toString());
                         flag=1;
                     }
                     catch (NumberFormatException e)
                     {
                         flag=0;
                         n2=0;

                     }
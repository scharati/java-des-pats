If the Duck super class gets a new Fly() method then all the ducks would 
inherit irrespective of whether it's appropriate or not.If there is a piece
of code which deals with collections of ducks and the methods are called on 
them without checking type then some inappropriate behavior will be shown.
For example : rubber ducks in this case can end up flying. 

To avoid the developer has to decide which behavior is appropriate which 
classes. Ideally this should be part of the class/type. Since this 
information is not encoded there one needs to decide and do a type check 
all over the place.

This way types would be all over the code and may result in errors when new 
code is being added under those type check blocks.Readability would suffer
as the classes/types would be counter intuitive.

More importantly in many cases change to some functionality will probably 
have ripple effects - the code would get affected at multiple places

Another approach would be to override behaviors at each class and provide the
correct one. This would shift the code to logical places but will have lot of
duplications. Any new duck would need implementation for almost all the methods
even if they are not applicable. The ducks are being forced to provide NO
BEHAVIOR.
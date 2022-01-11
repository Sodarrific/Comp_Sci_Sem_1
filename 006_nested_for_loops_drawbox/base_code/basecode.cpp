// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char clck;
	cout<<"char"<<endl;
	cin>>clck;
	cout<<"width of char"<<endl;
	int pos2 = 0;
	int pos1 = 0;
	int count = 0;
	int count2 = 0;
	cin>>pos2;
	cout<<"height of char"<<endl;
	cin>>pos1;
	while(true){
		if(pos1==count2){
			break;
		}
		while(true){
			if(count==pos2){
				cout<<" "<<endl;
				break;
			}
			cout<<clck;
			count=count + 1;
		
		}
		count2=count2 + 1;
		count=0;
	}

}

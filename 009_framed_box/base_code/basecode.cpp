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
	int count3 = 1;
	int count4 = 0;
	cin>>pos2;
	int space = pos2 - 2;
	cout<<"height of char"<<endl;
	cin>>pos1;
	int spacers = pos1 - 2;
	while(true){
		if(pos2==count3){
			cout<<clck<<endl;
			break;
		}
		cout<<clck;
		count3 = count3 + 1;
	}
	while(true){
		if(spacers==count2){
			break;
		}
		cout<<clck;
		while(true){
			if(count==space){
				cout<<clck<<endl;
				break;
			}
			cout<<" ";
			count=count + 1;
		}
		
		count2=count2 + 1;
		count=0;
	}
	while(true){
		if(pos2==count4){
			break;
		}
		cout<<clck;
		count4 = count4 + 1;
	}

}

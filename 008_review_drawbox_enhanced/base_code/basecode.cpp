// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char clck;
	cout<<"char"<<endl;
	cin>>clck;
	int startx = 0;
	int starty = 0;
	cout<<"Start X"<<endl;
	cin>>startx;
	cout<<"Start Y"<<endl;
	cin>>starty;
	int stratx = 0 + startx;
	int straty = 11 + starty;
	cout<<"width of char"<<endl;
	int pos2 = 0;
	int pos1 = 0;
	int count = 0;
	int count2 = 0;
	cin>>pos2;
	cout<<"height of char"<<endl;
	cin>>pos1;
	while(true){
		gotoxy(stratx,straty);
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

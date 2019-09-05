package tigerDogs;

public class GameBegin {
    public static void main(String[] args) {
        //绘制棋盘
        new chessBoard();

        //播放背景音乐
        new magicMusic.Play0("src/tigerDogs/BGMs/bgm.mp3").start();


        /*NewGame a=new NewGame(a.array, a.ID);

        GameNeeds a=new GameNeeds();
        Print.print(a.ID);*/
        /*while (gameContinue) {
                System.out.println("输入想要移动的棋子坐标、目的地坐标：");
                //Scanner toBeMoved = new Scanner(System.in);
                int temp; //用于交换数组里的值
                int x1 = UI.sXY.y1;
                int y1 = UI.sXY.x1;
                int x2 = UI.sXY.y2;
                int y2 = UI.sXY.x2;           //x1,y1：想要移动的棋子的坐标，x2,y2：目的地坐标
                moveFlag = Move.move(array, x1, y1, x2, y2, flag);
                //UI.sXY.changeO(1);
                //System.out.println("主函数读取数据："+UI.sXY.x1+UI.sXY.y1+UI.sXY.x2+UI.sXY.y2+"跳过了");
                if (moveFlag) {
                    //交换棋子2
                    temp = array[x2][y2];
                    array[x2][y2] = array[x1][y1];
                    array[x1][y1] = temp;
                    //交换存狗id的数组
                    temp = ID[x2][y2];
                    ID[x2][y2] = ID[x1][y1];
                    ID[x1][y1] = temp;
                    //交换选手
                    flag = !flag;
                    //落子的声音
                    new magicMusic.Play0("/Users/chenzhixin/Desktop/Tiger_and_Dogs/src/tigerDogs/BGMs/chessDown.mp3").start();
                }

                if (moveFlag && !flag) {                      //虎走棋 //flag先改变了 再取个反
                    //Eat.dogseaten(Dogseaten);             //虎能否吃狗并给出被吃狗的坐标
                    Eat.eat(array, ID);                      //虎能否吃狗并删除狗
                    //判断狗的数量是否小于4 -> 小于等于2
                    if (TigerWin.tigerWin(array)) {
                        System.out.println("游戏结束，虎取得胜利！");
                        gameContinue = false;
                    }
                    //判断虎是否在陷阱中
                    if (TigerInTrap.TigerInTrap(array)) {
                        System.out.println("游戏结束，狗取得胜利！");
                        gameContinue = false;
                    }
                } else {//狗走棋
                    if (DogsWin.Dwin(array)) {
                        System.out.println("游戏结束，狗取得胜利！");
                        gameContinue = false;
                    }
                }
                System.out.println("移动后的新棋盘：");
                if (flag) {
                    System.out.println("请虎走棋");
                } else {
                    System.out.println("请狗走棋");
                }

                Print.print(array);

            }
        }*/
    }
}

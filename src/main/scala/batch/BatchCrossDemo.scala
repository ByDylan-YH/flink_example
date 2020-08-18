package batch

import org.apache.flink.api.scala.ExecutionEnvironment

/**
 * Author:BYDylan
 * Date:2020/5/7
 * Description:获取2个数据集的笛卡尔积
 */
object BatchCrossDemo {
  def main(args: Array[String]): Unit = {
    val env: ExecutionEnvironment = ExecutionEnvironment.getExecutionEnvironment;
    import org.apache.flink.api.scala._;
    val data1 = List("zs", "ww");
    val data2 = List(1, 2);
    val text1: DataSet[String] = env.fromCollection(data1);
    val test2: DataSet[Int] = env.fromCollection(data2);
    text1.cross(test2).print();
  }
}
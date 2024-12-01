package com.learn;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!更改内容");
        String p = "<p>当<span class=\"mwe-math-element\"><span class=\"mwe-math-mathml-inline mwe-math-mathml-a11y\" style=\"display: none;\"><math xmlns=\"http://www.w3.org/1998/Math/MathML\" alttext=\"{\\displaystyle dp/ds>0}\">\n" +
                "  <semantics>\n" +
                "    <mrow class=\"MJX-TeXAtom-ORD\">\n" +
                "      <mstyle displaystyle=\"true\" scriptlevel=\"0\">\n" +
                "        <mi>d</mi>\n" +
                "        <mi>p</mi>\n" +
                "        <mrow class=\"MJX-TeXAtom-ORD\">\n" +
                "          <mo>/</mo>\n" +
                "        </mrow>\n" +
                "        <mi>d</mi>\n" +
                "        <mi>s</mi>\n" +
                "        <mo>&gt;</mo>\n" +
                "        <mn>0</mn>\n" +
                "      </mstyle>\n" +
                "    </mrow>\n" +
                "    <annotation encoding=\"application/x-tex\">{\\displaystyle dp/ds&gt;0}</annotation>\n" +
                "  </semantics>\n" +
                "</math></span><img src=\"https://wikimedia.org/api/rest_v1/media/math/render/svg/55f72db7c3f6cbb04b3b176514a3c5241277d952\" class=\"mwe-math-fallback-image-inline mw-invert skin-invert\" aria-hidden=\"true\" style=\"vertical-align: -0.838ex; width:10.115ex; height:2.843ex;\" alt=\"{\\displaystyle dp/ds>0}\"></span>时，出现逆压梯度的现象，若逆压梯度够大，会使得速度<span class=\"mwe-math-element\"><span class=\"mwe-math-mathml-inline mwe-math-mathml-a11y\" style=\"display: none;\"><math xmlns=\"http://www.w3.org/1998/Math/MathML\" alttext=\"{\\displaystyle u}\">\n" +
                "  <semantics>\n" +
                "    <mrow class=\"MJX-TeXAtom-ORD\">\n" +
                "      <mstyle displaystyle=\"true\" scriptlevel=\"0\">\n" +
                "        <mi>u</mi>\n" +
                "      </mstyle>\n" +
                "    </mrow>\n" +
                "    <annotation encoding=\"application/x-tex\">{\\displaystyle u}</annotation>\n" +
                "  </semantics>\n" +
                "</math></span><img src=\"https://wikimedia.org/api/rest_v1/media/math/render/svg/c3e6bb763d22c20916ed4f0bb6bd49d7470cffd8\" class=\"mwe-math-fallback-image-inline mw-invert skin-invert\" aria-hidden=\"true\" style=\"vertical-align: -0.338ex; width:1.33ex; height:1.676ex;\" alt=\"{\\displaystyle u}\"></span>沿着流线<span class=\"mwe-math-element\"><span class=\"mwe-math-mathml-inline mwe-math-mathml-a11y\" style=\"display: none;\"><math xmlns=\"http://www.w3.org/1998/Math/MathML\" alttext=\"{\\displaystyle s}\">\n" +
                "  <semantics>\n" +
                "    <mrow class=\"MJX-TeXAtom-ORD\">\n" +
                "      <mstyle displaystyle=\"true\" scriptlevel=\"0\">\n" +
                "        <mi>s</mi>\n" +
                "      </mstyle>\n" +
                "    </mrow>\n" +
                "    <annotation encoding=\"application/x-tex\">{\\displaystyle s}</annotation>\n" +
                "  </semantics>\n" +
                "</math></span><img src=\"https://wikimedia.org/api/rest_v1/media/math/render/svg/01d131dfd7673938b947072a13a9744fe997e632\" class=\"mwe-math-fallback-image-inline mw-invert skin-invert\" aria-hidden=\"true\" style=\"vertical-align: -0.338ex; width:1.09ex; height:1.676ex;\" alt=\"{\\displaystyle s}\"></span>减少，最后甚至可能变为零或负值<sup id=\"cite_ref-4\" class=\"reference\"><a href=\"#cite_note-4\"><span class=\"cite-bracket\">[</span>4<span class=\"cite-bracket\">]</span></a></sup>。\n" +
                "</p>";

        String dl = "<dl><dt>递归</dt>\n" +
                "<dd>递归算法是一种重复调用（引用）自身的算法，直到某个条件（也称为终止条件）匹配，这是函数式编程常用的方法。迭代算法使用循环之类的重复构造，有时使用堆栈之类的附加数据结构来解决给定的问题。有些问题自然适合于这种或那种实现。例如，使用递归实现可以很好地理解河内的塔。每个递归版本都有一个等价的（但可能或多或少复杂）迭代版本，反之亦然。</dd>\n" +
                "<dt>串联的、平行的或分布的</dt>\n" +
                "<dd>算法通常是在假设计算机一次执行一条算法指令的情况下讨论的。那些计算机有时被称为串行计算机。针对这种环境设计的算法称为串行算法，而不是并行算法或分布式算法。并行算法是利用计算机体系结构的算法，其中多个处理器可以同时处理一个问题。分布式算法是使用与计算机网络连接的多台机器的算法。并行和分布式算法将问题划分为更加对称或不对称的子问题，并将结果收集在一起。例如，CPU 就是并行算法的一个例子。这种算法的资源消耗不仅是每个处理器上的处理器周期，而且是处理器之间的通信开销。有些排序算法可以有效地并行化，但是它们的通信开销很大。迭代算法通常是可并行的，但有些问题没有并行算法，称为固有的串行问题。</dd>\n" +
                "<dt>确定的或不确定的</dt>\n" +
                "<dd>确定性算法在算法的每一步都用精确的决策来解决问题，而非确定性算法通过猜测来解决问题，虽然通过启发式使典型的猜测更加精确。</dd>\n" +
                "<dt>精确的或近似的</dt>\n" +
                "<dd>虽然许多算法达到一个精确的解决方案，近似算法寻求一个近似，更接近真正的解决方案。这种近似可以通过使用确定性策略或随机策略来实现。这些算法对许多难题都有实用价值。近似算法的一个例子是背包问题，其中有一组给定的项目。它的目标是包装背包，以获得最大的总价值。每个物品都有一定的重量和价值。可携带的总重量不超过某个固定数字 X，因此，解决方案必须考虑物品的重量及其价值。<sup id=\"cite_ref-17\" class=\"reference\"><a href=\"#cite_note-17\"><span class=\"cite-bracket\">[</span>17<span class=\"cite-bracket\">]</span></a></sup></dd>\n" +
                "<dt>量子算法</dt>\n" +
                "<dd>量子算法运行在一个现实的量子计算模型上。这个术语通常用于那些本质上似乎是量子的算法，或者使用量子计算的一些基本特性，如态叠加原理或量子纠缠。</dd></dl>";

        try {
            // 使用Jsoup解析字符串为Document对象
            Document doc = Jsoup.parse(p);
            Document doc2 = Jsoup.parse(dl);

            Elements elements = doc2.getElementsByTag("dt");
            System.out.println(elements.text());
//            // 获取段落元素
//            Element paragraph = doc.selectFirst("p");
//            if (paragraph != null) {
//
////                // 获取段落中的文本内容（去除HTML标签）
//                String text = paragraph.text();
//                System.out.println("段落文本内容：" + text);
//
//                paragraph.select("annotation").remove();
//                System.out.println("段落文本内容：" + paragraph.text());
//
//                // 获取段落中的所有超链接元素
//                Elements links = paragraph.select("a");
//                for (Element link : links) {
//                    System.out.println("超链接：" + link.attr("href") + "，链接文本：" + link.text());
//                }
//
//                // 获取段落中的上标元素
//                Elements superscripts = paragraph.select("sup");
//                for (Element superscript : superscripts) {
//                    System.out.println("上标内容：" + superscript.text());
//                    System.out.println("上标引用的目标：" + superscript.selectFirst("a").attr("href"));
//                }
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
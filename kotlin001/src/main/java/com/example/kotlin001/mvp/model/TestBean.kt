package com.example.kotlin001.mvp.model

/**
 * Create by HanN on 2019/5/6
 * 注释:
 */
class TestBean {

    /**
     * msg : 获取资源成功!
     * code : 0
     * rows : {"first":1,"limit":2147483647,"offset":0,"pageNumber":1,"pageSize":20,"rows":[{"coordX":0,"coordY":0,"createTime":"2019-05-06 20:52:57","hasPtz":0,"id":"41756b2d74fa4d50a5beae9aee4ed342","lockId":0,"name":"01鄂东运营公司","parentId":"0","status":10,"type":10},{"coordX":0,"coordY":0,"createTime":"2019-05-06 20:52:57","hasPtz":0,"id":"44c870e8d3d1497880f59c6e510b2c55","lockId":0,"name":"02.鄂西北运营公司","parentId":"0","status":10,"type":10},{"coordX":0,"coordY":0,"createTime":"2019-05-06 20:52:57","hasPtz":0,"id":"94f96c3858f44265873d9ec157807bb6","lockId":0,"name":"03.江汉运营公司","parentId":"0","status":10,"type":10},{"coordX":0,"coordY":0,"createTime":"2019-05-06 20:52:57","hasPtz":0,"id":"246f8242fb2c4eb581250ccea4abb47c","lockId":0,"name":"04.宜昌公司","parentId":"0","status":10,"type":10},{"coordX":0,"coordY":0,"createTime":"2019-05-06 20:52:57","hasPtz":0,"id":"763500a6ba284506a3f092dbb24d9377","lockId":0,"name":"05实业公司","parentId":"0","status":10,"type":10}],"total":5,"totalPages":1}
     */

    var msg: String? = null
    var code: Int = 0
    var rows: RowsBeanX? = null

    class RowsBeanX {
        /**
         * first : 1
         * limit : 2147483647
         * offset : 0
         * pageNumber : 1
         * pageSize : 20
         * rows : [{"coordX":0,"coordY":0,"createTime":"2019-05-06 20:52:57","hasPtz":0,"id":"41756b2d74fa4d50a5beae9aee4ed342","lockId":0,"name":"01鄂东运营公司","parentId":"0","status":10,"type":10},{"coordX":0,"coordY":0,"createTime":"2019-05-06 20:52:57","hasPtz":0,"id":"44c870e8d3d1497880f59c6e510b2c55","lockId":0,"name":"02.鄂西北运营公司","parentId":"0","status":10,"type":10},{"coordX":0,"coordY":0,"createTime":"2019-05-06 20:52:57","hasPtz":0,"id":"94f96c3858f44265873d9ec157807bb6","lockId":0,"name":"03.江汉运营公司","parentId":"0","status":10,"type":10},{"coordX":0,"coordY":0,"createTime":"2019-05-06 20:52:57","hasPtz":0,"id":"246f8242fb2c4eb581250ccea4abb47c","lockId":0,"name":"04.宜昌公司","parentId":"0","status":10,"type":10},{"coordX":0,"coordY":0,"createTime":"2019-05-06 20:52:57","hasPtz":0,"id":"763500a6ba284506a3f092dbb24d9377","lockId":0,"name":"05实业公司","parentId":"0","status":10,"type":10}]
         * total : 5
         * totalPages : 1
         */

        var first: Int = 0
        var limit: Int = 0
        var offset: Int = 0
        var pageNumber: Int = 0
        var pageSize: Int = 0
        var total: Int = 0
        var totalPages: Int = 0
        var rows: ArrayList<RowsBean>? = null

        class RowsBean {
            /**
             * coordX : 0
             * coordY : 0
             * createTime : 2019-05-06 20:52:57
             * hasPtz : 0
             * id : 41756b2d74fa4d50a5beae9aee4ed342
             * lockId : 0
             * name : 01鄂东运营公司
             * parentId : 0
             * status : 10
             * type : 10
             */

            var coordX: Int = 0
            var coordY: Int = 0
            var createTime: String? = null
            var hasPtz: Int = 0
            var id: String? = null
            var lockId: Int = 0
            var name: String? = null
            var parentId: String? = null
            var status: Int = 0
            var type: Int = 0
        }
    }
}

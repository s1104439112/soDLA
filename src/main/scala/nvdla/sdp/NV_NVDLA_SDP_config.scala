package nvdla

import chisel3._
import chisel3.experimental._
import chisel3.util._

class sdpConfiguration extends cdmaConfiguration
{
    val AM_AW = NVDLA_MEMORY_ATOMIC_LOG2       //atomic m address width
    val AM_AW2 = NVDLA_MEMORY_ATOMIC_LOG2-1
    val AM_DW = NVDLA_MEMORY_ATOMIC_SIZE*8      //atomic m bus width: atomic_m * 1byte
    val AM_DW2 = NVDLA_MEMORY_ATOMIC_SIZE*16    //atomic m bus width: atomic_m * 2byte

    val TW = NVDLA_SDP_EW_THROUGHPUT_LOG2  

    val SDP_WR_CMD_DW = NVDLA_MEM_ADDRESS_WIDTH-AM_AW+13 

    val BS_OP_DW = 16*NVDLA_SDP_BS_THROUGHPUT    
    val BN_OP_DW = 16*NVDLA_SDP_BN_THROUGHPUT
    val EW_OP_DW = 16*NVDLA_SDP_EW_THROUGHPUT  
    val EW_OC_DW = 32*NVDLA_SDP_EW_THROUGHPUT

    val BS_IN_DW = 32*NVDLA_SDP_BS_THROUGHPUT
    val BS_OUT_DW = 32*NVDLA_SDP_BS_THROUGHPUT
    val BN_IN_DW = 32*NVDLA_SDP_BN_THROUGHPUT
    val BN_OUT_DW = 32*NVDLA_SDP_BN_THROUGHPUT
    val EW_IN_DW = 32*NVDLA_SDP_EW_THROUGHPUT
    val EW_OUT_DW = 32*NVDLA_SDP_EW_THROUGHPUT

    val EW_CORE_OUT_DW = 32*NVDLA_SDP_EW_THROUGHPUT
    val EW_IDX_OUT_DW = 81*NVDLA_SDP_EW_THROUGHPUT
    val EW_LUT_OUT_DW = 185*NVDLA_SDP_EW_THROUGHPUT
    val EW_INP_OUT_DW = 32*NVDLA_SDP_EW_THROUGHPUT

    val DP_DIN_DW = 32*NVDLA_MEMORY_ATOMIC_SIZE 
    val DP_IN_DW = 32*NVDLA_SDP_MAX_THROUGHPUT
    val BS_DOUT_DW = 32*NVDLA_SDP_MAX_THROUGHPUT
    val BN_DIN_DW  = 32*NVDLA_SDP_MAX_THROUGHPUT
    val BN_DOUT_DW  = 32*NVDLA_SDP_MAX_THROUGHPUT
    val EW_DIN_DW  = 32*NVDLA_SDP_MAX_THROUGHPUT
    val EW_DOUT_DW = 32*NVDLA_SDP_MAX_THROUGHPUT
    val CV_IN_DW = 32*NVDLA_SDP_MAX_THROUGHPUT
    val CV_OUT_DW = 16*NVDLA_SDP_MAX_THROUGHPUT
    val DP_OUT_DW = NVDLA_BPE*NVDLA_SDP_MAX_THROUGHPUT 
    val DP_DOUT_DW = AM_DW                         //int8: 32 * 1B ; int16: 16 * 2B

    val LUT_TABLE_LE_DEPTH = 65
    val LUT_TABLE_LO_DEPTH = 257
    val LUT_TABLE_MAX_DEPTH = LUT_TABLE_LO_DEPTH



}
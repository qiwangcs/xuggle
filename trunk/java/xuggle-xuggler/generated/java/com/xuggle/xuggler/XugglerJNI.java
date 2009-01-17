/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;

import com.xuggle.ferry.*;

class XugglerJNI {

// Xuggler.i: Start generated code
// >>>>>>>>>>>>>>>>>>>>>>>>>>>

  static {
    com.xuggle.ferry.JNILibraryLoader.loadLibrary("xuggle-xuggler",
      new Long(Version.MAJOR_VERSION));
  }
  
// <<<<<<<<<<<<<<<<<<<<<<<<<<<
// Xuggler.i: End generated code
  

  public final static native int IPixelFormat_NONE_get();
  public final static native int IPixelFormat_YUV_Y_get();
  public final static native int IPixelFormat_YUV_U_get();
  public final static native int IPixelFormat_YUV_V_get();
  public final static native short IPixelFormat_getYUV420PPixel(long jarg1, IVideoPicture jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native void IPixelFormat_setYUV420PPixel(long jarg1, IVideoPicture jarg1_, int jarg2, int jarg3, int jarg4, short jarg5);
  public final static native int IPixelFormat_getYUV420PPixelOffset(long jarg1, IVideoPicture jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int IRational_getNumerator(long jarg1, IRational jarg1_);
  public final static native int IRational_getDenominator(long jarg1, IRational jarg1_);
  public final static native long IRational_copy(long jarg1, IRational jarg1_);
  public final static native int IRational_compareTo(long jarg1, IRational jarg1_, long jarg2, IRational jarg2_);
  public final static native int IRational_sCompareTo(long jarg1, IRational jarg1_, long jarg2, IRational jarg2_);
  public final static native double IRational_getDouble(long jarg1, IRational jarg1_);
  public final static native int IRational_reduce(long jarg1, IRational jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native int IRational_sReduce(long jarg1, IRational jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native long IRational_multiply(long jarg1, IRational jarg1_, long jarg2, IRational jarg2_);
  public final static native long IRational_sMultiply(long jarg1, IRational jarg1_, long jarg2, IRational jarg2_);
  public final static native long IRational_divide(long jarg1, IRational jarg1_, long jarg2, IRational jarg2_);
  public final static native long IRational_sDivide(long jarg1, IRational jarg1_, long jarg2, IRational jarg2_);
  public final static native long IRational_subtract(long jarg1, IRational jarg1_, long jarg2, IRational jarg2_);
  public final static native long IRational_sSubtract(long jarg1, IRational jarg1_, long jarg2, IRational jarg2_);
  public final static native long IRational_add(long jarg1, IRational jarg1_, long jarg2, IRational jarg2_);
  public final static native long IRational_sAdd(long jarg1, IRational jarg1_, long jarg2, IRational jarg2_);
  public final static native long IRational_rescale(long jarg1, IRational jarg1_, long jarg2, long jarg3, IRational jarg3_);
  public final static native long IRational_sRescale(long jarg1, long jarg2, IRational jarg2_, long jarg3, IRational jarg3_);
  public final static native long IRational_make__SWIG_0();
  public final static native long IRational_make__SWIG_1(double jarg1);
  public final static native long IRational_make__SWIG_2(long jarg1, IRational jarg1_);
  public final static native long IRational_make__SWIG_3(int jarg1, int jarg2);
  public final static native long IMediaData_getTimeStamp(long jarg1, IMediaData jarg1_);
  public final static native void IMediaData_setTimeStamp(long jarg1, IMediaData jarg1_, long jarg2);
  public final static native long IMediaData_getTimeBase(long jarg1, IMediaData jarg1_);
  public final static native void IMediaData_setTimeBase(long jarg1, IMediaData jarg1_, long jarg2, IRational jarg2_);
  public final static native long IMediaData_getData(long jarg1, IMediaData jarg1_);
  public final static native int IMediaData_getSize(long jarg1, IMediaData jarg1_);
  public final static native boolean IMediaData_isKey(long jarg1, IMediaData jarg1_);
  public final static native long IMediaDataWrapper_get(long jarg1, IMediaDataWrapper jarg1_);
  public final static native void IMediaDataWrapper_wrap(long jarg1, IMediaDataWrapper jarg1_, long jarg2, IMediaData jarg2_);
  public final static native void IMediaDataWrapper_setKey(long jarg1, IMediaDataWrapper jarg1_, boolean jarg2);
  public final static native long IMediaDataWrapper_make(long jarg1, IMediaData jarg1_);
  public final static native long ITimeValue_make__SWIG_0(long jarg1, int jarg2);
  public final static native long ITimeValue_make__SWIG_1(long jarg1, ITimeValue jarg1_);
  public final static native long ITimeValue_get(long jarg1, ITimeValue jarg1_, int jarg2);
  public final static native int ITimeValue_compareTo(long jarg1, ITimeValue jarg1_, long jarg2, ITimeValue jarg2_);
  public final static native int ITimeValue_compare__SWIG_0(long jarg1, ITimeValue jarg1_, long jarg2, ITimeValue jarg2_);
  public final static native int ITimeValue_compare__SWIG_1(long jarg1, long jarg2);
  public final static native int ICodec_CODEC_ID_PCM_S16LE_get();
  public final static native int ICodec_CODEC_ID_ADPCM_IMA_QT_get();
  public final static native int ICodec_CODEC_ID_AMR_NB_get();
  public final static native int ICodec_CODEC_ID_RA_144_get();
  public final static native int ICodec_CODEC_ID_ROQ_DPCM_get();
  public final static native int ICodec_CODEC_ID_MP2_get();
  public final static native int ICodec_CODEC_ID_DVD_SUBTITLE_get();
  public final static native int ICodec_CODEC_ID_TTF_get();
  public final static native int ICodec_CODEC_ID_PROBE_get();
  public final static native int ICodec_CODEC_ID_MPEG2TS_get();
  public final static native int ICodec_CODEC_TYPE_UNKNOWN_get();
  public final static native String ICodec_getName(long jarg1, ICodec jarg1_);
  public final static native int ICodec_getIDAsInt(long jarg1, ICodec jarg1_);
  public final static native int ICodec_getID(long jarg1, ICodec jarg1_);
  public final static native int ICodec_getType(long jarg1, ICodec jarg1_);
  public final static native boolean ICodec_canDecode(long jarg1, ICodec jarg1_);
  public final static native boolean ICodec_canEncode(long jarg1, ICodec jarg1_);
  public final static native long ICodec_findEncodingCodec(int jarg1);
  public final static native long ICodec_findEncodingCodecByIntID(int jarg1);
  public final static native long ICodec_findEncodingCodecByName(String jarg1);
  public final static native long ICodec_findDecodingCodec(int jarg1);
  public final static native long ICodec_findDecodingCodecByIntID(int jarg1);
  public final static native long ICodec_findDecodingCodecByName(String jarg1);
  public final static native long ICodec_guessEncodingCodec(long jarg1, IContainerFormat jarg1_, String jarg2, String jarg3, String jarg4, int jarg5);
  public final static native void IPacket_reset(long jarg1, IPacket jarg1_);
  public final static native boolean IPacket_isComplete(long jarg1, IPacket jarg1_);
  public final static native long IPacket_getPts(long jarg1, IPacket jarg1_);
  public final static native void IPacket_setPts(long jarg1, IPacket jarg1_, long jarg2);
  public final static native long IPacket_getDts(long jarg1, IPacket jarg1_);
  public final static native void IPacket_setDts(long jarg1, IPacket jarg1_, long jarg2);
  public final static native int IPacket_getSize(long jarg1, IPacket jarg1_);
  public final static native int IPacket_getMaxSize(long jarg1, IPacket jarg1_);
  public final static native int IPacket_getStreamIndex(long jarg1, IPacket jarg1_);
  public final static native int IPacket_getFlags(long jarg1, IPacket jarg1_);
  public final static native boolean IPacket_isKeyPacket(long jarg1, IPacket jarg1_);
  public final static native long IPacket_getDuration(long jarg1, IPacket jarg1_);
  public final static native long IPacket_getPosition(long jarg1, IPacket jarg1_);
  public final static native long IPacket_getData(long jarg1, IPacket jarg1_);
  public final static native int IPacket_allocateNewPayload(long jarg1, IPacket jarg1_, int jarg2);
  public final static native long IPacket_make__SWIG_0();
  public final static native long IPacket_make__SWIG_1(long jarg1, IBuffer jarg1_);
  public final static native int IAudioSamples_FMT_NONE_get();
  public final static native boolean IAudioSamples_isComplete(long jarg1, IAudioSamples jarg1_);
  public final static native int IAudioSamples_getSampleRate(long jarg1, IAudioSamples jarg1_);
  public final static native int IAudioSamples_getChannels(long jarg1, IAudioSamples jarg1_);
  public final static native long IAudioSamples_getSampleBitDepth(long jarg1, IAudioSamples jarg1_);
  public final static native int IAudioSamples_getFormat(long jarg1, IAudioSamples jarg1_);
  public final static native long IAudioSamples_getNumSamples(long jarg1, IAudioSamples jarg1_);
  public final static native long IAudioSamples_getMaxBufferSize(long jarg1, IAudioSamples jarg1_);
  public final static native long IAudioSamples_getMaxSamples(long jarg1, IAudioSamples jarg1_);
  public final static native long IAudioSamples_getSampleSize(long jarg1, IAudioSamples jarg1_);
  public final static native long IAudioSamples_getPts(long jarg1, IAudioSamples jarg1_);
  public final static native void IAudioSamples_setPts(long jarg1, IAudioSamples jarg1_, long jarg2);
  public final static native long IAudioSamples_getNextPts(long jarg1, IAudioSamples jarg1_);
  public final static native void IAudioSamples_setComplete(long jarg1, IAudioSamples jarg1_, boolean jarg2, long jarg3, int jarg4, int jarg5, int jarg6, long jarg7);
  public final static native int IAudioSamples_setSample(long jarg1, IAudioSamples jarg1_, long jarg2, int jarg3, int jarg4, int jarg5);
  public final static native int IAudioSamples_getSample(long jarg1, IAudioSamples jarg1_, long jarg2, int jarg3, int jarg4);
  public final static native long IAudioSamples_findSampleBitDepth(int jarg1);
  public final static native long IAudioSamples_make(long jarg1, long jarg2);
  public final static native long IAudioSamples_samplesToDefaultPts(long jarg1, int jarg2);
  public final static native long IAudioSamples_defaultPtsToSamples(long jarg1, int jarg2);
  public final static native int IAudioResampler_getOutputChannels(long jarg1, IAudioResampler jarg1_);
  public final static native int IAudioResampler_getOutputRate(long jarg1, IAudioResampler jarg1_);
  public final static native int IAudioResampler_getInputChannels(long jarg1, IAudioResampler jarg1_);
  public final static native int IAudioResampler_getInputRate(long jarg1, IAudioResampler jarg1_);
  public final static native int IAudioResampler_resample(long jarg1, IAudioResampler jarg1_, long jarg2, IAudioSamples jarg2_, long jarg3, IAudioSamples jarg3_, long jarg4);
  public final static native long IAudioResampler_make(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native boolean IVideoPicture_isKeyFrame(long jarg1, IVideoPicture jarg1_);
  public final static native void IVideoPicture_setKeyFrame(long jarg1, IVideoPicture jarg1_, boolean jarg2);
  public final static native boolean IVideoPicture_isComplete(long jarg1, IVideoPicture jarg1_);
  public final static native int IVideoPicture_getSize(long jarg1, IVideoPicture jarg1_);
  public final static native int IVideoPicture_getWidth(long jarg1, IVideoPicture jarg1_);
  public final static native int IVideoPicture_getHeight(long jarg1, IVideoPicture jarg1_);
  public final static native int IVideoPicture_getPixelType(long jarg1, IVideoPicture jarg1_);
  public final static native long IVideoPicture_getPts(long jarg1, IVideoPicture jarg1_);
  public final static native void IVideoPicture_setPts(long jarg1, IVideoPicture jarg1_, long jarg2);
  public final static native int IVideoPicture_getQuality(long jarg1, IVideoPicture jarg1_);
  public final static native void IVideoPicture_setQuality(long jarg1, IVideoPicture jarg1_, int jarg2);
  public final static native int IVideoPicture_getDataLineSize(long jarg1, IVideoPicture jarg1_, int jarg2);
  public final static native void IVideoPicture_setComplete(long jarg1, IVideoPicture jarg1_, boolean jarg2, int jarg3, int jarg4, int jarg5, long jarg6);
  public final static native boolean IVideoPicture_copy(long jarg1, IVideoPicture jarg1_, long jarg2, IVideoPicture jarg2_);
  public final static native long IVideoPicture_make__SWIG_0(int jarg1, int jarg2, int jarg3);
  public final static native long IVideoPicture_make__SWIG_1(long jarg1, IVideoPicture jarg1_);
  public final static native int IVideoResampler_getInputWidth(long jarg1, IVideoResampler jarg1_);
  public final static native int IVideoResampler_getInputHeight(long jarg1, IVideoResampler jarg1_);
  public final static native int IVideoResampler_getInputPixelFormat(long jarg1, IVideoResampler jarg1_);
  public final static native int IVideoResampler_getOutputWidth(long jarg1, IVideoResampler jarg1_);
  public final static native int IVideoResampler_getOutputHeight(long jarg1, IVideoResampler jarg1_);
  public final static native int IVideoResampler_getOutputPixelFormat(long jarg1, IVideoResampler jarg1_);
  public final static native int IVideoResampler_resample(long jarg1, IVideoResampler jarg1_, long jarg2, IVideoPicture jarg2_, long jarg3, IVideoPicture jarg3_);
  public final static native long IVideoResampler_make(int jarg1, int jarg2, int jarg3, int jarg4, int jarg5, int jarg6);
  public final static native boolean IVideoResampler_isSupported(int jarg1);
  public final static native int IStreamCoder_FLAG_QSCALE_get();
  public final static native int IStreamCoder_FLAG_4MV_get();
  public final static native int IStreamCoder_FLAG_QPEL_get();
  public final static native int IStreamCoder_FLAG_GMC_get();
  public final static native int IStreamCoder_FLAG_MV0_get();
  public final static native int IStreamCoder_FLAG_PART_get();
  public final static native int IStreamCoder_FLAG_INPUT_PRESERVED_get();
  public final static native int IStreamCoder_FLAG_PASS1_get();
  public final static native int IStreamCoder_FLAG_PASS2_get();
  public final static native int IStreamCoder_FLAG_EXTERN_HUFF_get();
  public final static native int IStreamCoder_FLAG_GRAY_get();
  public final static native int IStreamCoder_FLAG_EMU_EDGE_get();
  public final static native int IStreamCoder_FLAG_PSNR_get();
  public final static native int IStreamCoder_FLAG_TRUNCATED_get();
  public final static native int IStreamCoder_FLAG_NORMALIZE_AQP_get();
  public final static native int IStreamCoder_FLAG_INTERLACED_DCT_get();
  public final static native int IStreamCoder_FLAG_LOW_DELAY_get();
  public final static native int IStreamCoder_FLAG_ALT_SCAN_get();
  public final static native int IStreamCoder_FLAG_TRELLIS_QUANT_get();
  public final static native int IStreamCoder_FLAG_GLOBAL_HEADER_get();
  public final static native int IStreamCoder_FLAG_BITEXACT_get();
  public final static native int IStreamCoder_FLAG_AC_PRED_get();
  public final static native int IStreamCoder_FLAG_H263P_UMV_get();
  public final static native int IStreamCoder_FLAG_CBP_RD_get();
  public final static native int IStreamCoder_FLAG_QP_RD_get();
  public final static native int IStreamCoder_FLAG_H263P_AIV_get();
  public final static native int IStreamCoder_FLAG_OBMC_get();
  public final static native int IStreamCoder_FLAG_LOOP_FILTER_get();
  public final static native int IStreamCoder_FLAG_H263P_SLICE_STRUCT_get();
  public final static native int IStreamCoder_FLAG_INTERLACED_ME_get();
  public final static native int IStreamCoder_FLAG_SVCD_SCAN_OFFSET_get();
  public final static native int IStreamCoder_FLAG_CLOSED_GOP_get();
  public final static native int IStreamCoder_FLAG2_FAST_get();
  public final static native int IStreamCoder_FLAG2_STRICT_GOP_get();
  public final static native int IStreamCoder_FLAG2_NO_OUTPUT_get();
  public final static native int IStreamCoder_FLAG2_LOCAL_HEADER_get();
  public final static native int IStreamCoder_FLAG2_BPYRAMID_get();
  public final static native int IStreamCoder_FLAG2_WPRED_get();
  public final static native int IStreamCoder_FLAG2_MIXED_REFS_get();
  public final static native int IStreamCoder_FLAG2_8X8DCT_get();
  public final static native int IStreamCoder_FLAG2_FASTPSKIP_get();
  public final static native int IStreamCoder_FLAG2_AUD_get();
  public final static native int IStreamCoder_FLAG2_BRDO_get();
  public final static native int IStreamCoder_FLAG2_INTRA_VLC_get();
  public final static native int IStreamCoder_FLAG2_MEMC_ONLY_get();
  public final static native int IStreamCoder_FLAG2_DROP_FRAME_TIMECODE_get();
  public final static native int IStreamCoder_FLAG2_SKIP_RD_get();
  public final static native int IStreamCoder_FLAG2_CHUNKS_get();
  public final static native int IStreamCoder_FLAG2_NON_LINEAR_QUANT_get();
  public final static native int IStreamCoder_FLAG2_BIT_RESERVOIR_get();
  public final static native int IStreamCoder_getDirection(long jarg1, IStreamCoder jarg1_);
  public final static native long IStreamCoder_getStream(long jarg1, IStreamCoder jarg1_);
  public final static native long IStreamCoder_getCodec(long jarg1, IStreamCoder jarg1_);
  public final static native int IStreamCoder_getCodecType(long jarg1, IStreamCoder jarg1_);
  public final static native int IStreamCoder_getCodecID(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setCodec__SWIG_0(long jarg1, IStreamCoder jarg1_, long jarg2, ICodec jarg2_);
  public final static native void IStreamCoder_setCodec__SWIG_1(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native int IStreamCoder_getBitRate(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setBitRate(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native int IStreamCoder_getBitRateTolerance(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setBitRateTolerance(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native int IStreamCoder_getHeight(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setHeight(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native int IStreamCoder_getWidth(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setWidth(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native long IStreamCoder_getTimeBase(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setTimeBase(long jarg1, IStreamCoder jarg1_, long jarg2, IRational jarg2_);
  public final static native long IStreamCoder_getFrameRate(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setFrameRate(long jarg1, IStreamCoder jarg1_, long jarg2, IRational jarg2_);
  public final static native int IStreamCoder_getNumPicturesInGroupOfPictures(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setNumPicturesInGroupOfPictures(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native int IStreamCoder_getPixelType(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setPixelType(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native int IStreamCoder_getSampleRate(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setSampleRate(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native int IStreamCoder_getSampleFormat(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setSampleFormat(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native int IStreamCoder_getChannels(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setChannels(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native int IStreamCoder_getAudioFrameSize(long jarg1, IStreamCoder jarg1_);
  public final static native int IStreamCoder_getGlobalQuality(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setGlobalQuality(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native int IStreamCoder_getFlags(long jarg1, IStreamCoder jarg1_);
  public final static native void IStreamCoder_setFlags(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native boolean IStreamCoder_getFlag(long jarg1, IStreamCoder jarg1_, int jarg2);
  public final static native void IStreamCoder_setFlag(long jarg1, IStreamCoder jarg1_, int jarg2, boolean jarg3);
  public final static native long IStreamCoder_getNextPredictedPts(long jarg1, IStreamCoder jarg1_);
  public final static native int IStreamCoder_open(long jarg1, IStreamCoder jarg1_);
  public final static native int IStreamCoder_close(long jarg1, IStreamCoder jarg1_);
  public final static native int IStreamCoder_decodeAudio(long jarg1, IStreamCoder jarg1_, long jarg2, IAudioSamples jarg2_, long jarg3, IPacket jarg3_, int jarg4);
  public final static native int IStreamCoder_decodeVideo(long jarg1, IStreamCoder jarg1_, long jarg2, IVideoPicture jarg2_, long jarg3, IPacket jarg3_, int jarg4);
  public final static native int IStreamCoder_encodeVideo(long jarg1, IStreamCoder jarg1_, long jarg2, IPacket jarg2_, long jarg3, IVideoPicture jarg3_, int jarg4);
  public final static native int IStreamCoder_encodeAudio(long jarg1, IStreamCoder jarg1_, long jarg2, IPacket jarg2_, long jarg3, IAudioSamples jarg3_, long jarg4);
  public final static native long IStreamCoder_make(int jarg1);
  public final static native int IStream_getDirection(long jarg1, IStream jarg1_);
  public final static native int IStream_getIndex(long jarg1, IStream jarg1_);
  public final static native int IStream_getId(long jarg1, IStream jarg1_);
  public final static native long IStream_getStreamCoder(long jarg1, IStream jarg1_);
  public final static native long IStream_getFrameRate(long jarg1, IStream jarg1_);
  public final static native long IStream_getTimeBase(long jarg1, IStream jarg1_);
  public final static native long IStream_getStartTime(long jarg1, IStream jarg1_);
  public final static native long IStream_getDuration(long jarg1, IStream jarg1_);
  public final static native long IStream_getCurrentDts(long jarg1, IStream jarg1_);
  public final static native int IStream_getNumIndexEntries(long jarg1, IStream jarg1_);
  public final static native long IStream_getNumFrames(long jarg1, IStream jarg1_);
  public final static native long IStream_getSampleAspectRatio(long jarg1, IStream jarg1_);
  public final static native void IStream_setSampleAspectRatio(long jarg1, IStream jarg1_, long jarg2, IRational jarg2_);
  public final static native String IStream_getLanguage(long jarg1, IStream jarg1_);
  public final static native void IStream_setLanguage(long jarg1, IStream jarg1_, String jarg2);
  public final static native int IContainerFormat_setInputFormat(long jarg1, IContainerFormat jarg1_, String jarg2);
  public final static native int IContainerFormat_setOutputFormat(long jarg1, IContainerFormat jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native String IContainerFormat_getInputFormatShortName(long jarg1, IContainerFormat jarg1_);
  public final static native String IContainerFormat_getInputFormatLongName(long jarg1, IContainerFormat jarg1_);
  public final static native String IContainerFormat_getOutputFormatShortName(long jarg1, IContainerFormat jarg1_);
  public final static native String IContainerFormat_getOutputFormatLongName(long jarg1, IContainerFormat jarg1_);
  public final static native String IContainerFormat_getOutputFormatMimeType(long jarg1, IContainerFormat jarg1_);
  public final static native long IContainerFormat_make();
  public final static native int IContainer_setInputBufferLength(long jarg1, IContainer jarg1_, long jarg2);
  public final static native long IContainer_getInputBufferLength(long jarg1, IContainer jarg1_);
  public final static native boolean IContainer_isOpened(long jarg1, IContainer jarg1_);
  public final static native boolean IContainer_isHeaderWritten(long jarg1, IContainer jarg1_);
  public final static native int IContainer_open__SWIG_0(long jarg1, IContainer jarg1_, String jarg2, int jarg3, long jarg4, IContainerFormat jarg4_);
  public final static native int IContainer_open__SWIG_1(long jarg1, IContainer jarg1_, String jarg2, int jarg3, long jarg4, IContainerFormat jarg4_, boolean jarg5, boolean jarg6);
  public final static native long IContainer_getContainerFormat(long jarg1, IContainer jarg1_);
  public final static native int IContainer_close(long jarg1, IContainer jarg1_);
  public final static native int IContainer_getType(long jarg1, IContainer jarg1_);
  public final static native int IContainer_getNumStreams(long jarg1, IContainer jarg1_);
  public final static native long IContainer_getStream(long jarg1, IContainer jarg1_, long jarg2);
  public final static native long IContainer_addNewStream(long jarg1, IContainer jarg1_, int jarg2);
  public final static native int IContainer_writeHeader(long jarg1, IContainer jarg1_);
  public final static native int IContainer_writeTrailer(long jarg1, IContainer jarg1_);
  public final static native int IContainer_readNextPacket(long jarg1, IContainer jarg1_, long jarg2, IPacket jarg2_);
  public final static native int IContainer_writePacket__SWIG_0(long jarg1, IContainer jarg1_, long jarg2, IPacket jarg2_, boolean jarg3);
  public final static native int IContainer_writePacket__SWIG_1(long jarg1, IContainer jarg1_, long jarg2, IPacket jarg2_);
  public final static native long IContainer_make();
  public final static native int IContainer_queryStreamMetaData(long jarg1, IContainer jarg1_);
  public final static native int IContainer_seekKeyFrame(long jarg1, IContainer jarg1_, int jarg2, long jarg3, int jarg4);
  public final static native long IContainer_getDuration(long jarg1, IContainer jarg1_);
  public final static native long IContainer_getStartTime(long jarg1, IContainer jarg1_);
  public final static native long IContainer_getFileSize(long jarg1, IContainer jarg1_);
  public final static native int IContainer_getBitRate(long jarg1, IContainer jarg1_);
  public final static native long Global_NO_PTS_get();
  public final static native long Global_DEFAULT_PTS_PER_SECOND_get();
  public final static native long Global_getVersion();
  public final static native int Global_getVersionMajor();
  public final static native int Global_getVersionMinor();
  public final static native int Global_getVersionRevision();
  public final static native String Global_getVersionStr();
  public final static native int Global_getAVFormatVersion();
  public final static native String Global_getAVFormatVersionStr();
  public final static native int Global_getAVCodecVersion();
  public final static native String Global_getAVCodecVersionStr();
  public final static native long SWIGIPixelFormatUpcast(long jarg1);
  public final static native long SWIGIRationalUpcast(long jarg1);
  public final static native long SWIGIMediaDataUpcast(long jarg1);
  public final static native long SWIGIMediaDataWrapperUpcast(long jarg1);
  public final static native long SWIGITimeValueUpcast(long jarg1);
  public final static native long SWIGICodecUpcast(long jarg1);
  public final static native long SWIGIPacketUpcast(long jarg1);
  public final static native long SWIGIAudioSamplesUpcast(long jarg1);
  public final static native long SWIGIAudioResamplerUpcast(long jarg1);
  public final static native long SWIGIVideoPictureUpcast(long jarg1);
  public final static native long SWIGIVideoResamplerUpcast(long jarg1);
  public final static native long SWIGIStreamCoderUpcast(long jarg1);
  public final static native long SWIGIStreamUpcast(long jarg1);
  public final static native long SWIGIContainerFormatUpcast(long jarg1);
  public final static native long SWIGIContainerUpcast(long jarg1);
  public final static native long SWIGGlobalUpcast(long jarg1);
}

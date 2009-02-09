/*
 * Copyright (c) 2008-2009 by Xuggle Inc. All rights reserved.
 *
 * It is REQUESTED BUT NOT REQUIRED if you use this library, that you let 
 * us know by sending e-mail to info@xuggle.com telling us briefly how you're
 * using the library and what you like or don't like about it.
 *
 * This library is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation; either version 2.1 of the License, or (at your option) any later
 * version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along
 * with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
#ifndef __STREAMCODER_TEST_H__
#define __STREAMCODER_TEST_H__

#include <com/xuggle/testutils/TestUtils.h>
#include "Helper.h"
using namespace VS_CPP_NAMESPACE;

class StreamCoderTest : public CxxTest::TestSuite
{
  public:
    StreamCoderTest();
    virtual ~StreamCoderTest();
    void setUp();
    void tearDown();
    void testGetters();
    void testSetCodec();
    void testOpenAndClose();
    void testOpenButNoClose();
    void testCloseButNoOpen();
    void testDecodingAndEncodingFullyInterleavedFile();
    void testTimestamps();
    void testGetFrameSize();
    void disabled_testDecodingAndEncodingNellymoserAudio();
  private:
    Helper* h;
    Helper* hw;

    RefPointer<IStreamCoder> coder;
};


#endif // __STREAMCODER_TEST_H__

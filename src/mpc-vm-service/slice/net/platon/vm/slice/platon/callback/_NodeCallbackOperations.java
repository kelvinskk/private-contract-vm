// **********************************************************************
//
// Copyright (c) 2003-2018 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.4
//
// <auto-generated>
//
// Generated from file `platon_mpc_service.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package net.platon.vm.slice.platon.callback;

public interface _NodeCallbackOperations
{
    void invite(String taskid, int status, Ice.Current __current);

    void _notify(String taskid, int status, Ice.Current __current);

    void ready(String taskid, int status, Ice.Current __current);
}